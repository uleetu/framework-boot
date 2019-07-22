package org.ko.sigma.conf.security;

import org.ko.sigma.conf.security.handler.AuthenticationFailureHandlerImpl;
import org.ko.sigma.conf.security.handler.AuthenticationSuccessHandlerImpl;
import org.ko.sigma.conf.security.handler.LogoutSuccessHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.social.security.SpringSocialConfigurer;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 成功处理器
     */
    @Autowired
    private AuthenticationSuccessHandlerImpl authenticationSuccessHandlerImpl;

    /**
     * 失败处理器
     */
    @Autowired
    private AuthenticationFailureHandlerImpl authenticationFailureHandlerImpl;

    /**
     * 登出处理器
     */
    @Autowired
    private LogoutSuccessHandlerImpl logoutSuccessHandler;

    @Autowired private DataSource dataSource;

    @Autowired private UserDetailsService userDetailsService;

    @Autowired private SpringSocialConfigurer springSocialConfigurer;

    private String[] permitAll = new String[]{
            //swagger requests
            "/**/swagger-ui.html",
            "/**/swagger-resources/**",
            "/**/images/**",
            "/**/webjars/**",
            "/**/v2/api-docs",
            "/**/configuration/ui",
            "/**/configuration/security",

            //不需要验证的
            "/authentication/require",
            "/login",
            "/register",
            "/session/invalid",
            "/code/*"
    };

    @Bean
    public PasswordEncoder passwordEncoder() {
        //使用security默认的加密规则
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .apply(springSocialConfigurer) //往过滤器链添加过滤器
                .and()
                .formLogin() //表单登录
                .loginPage("/authentication/require")
                .loginProcessingUrl("/login")//用usernamePasswordFilter来处理请求
                .successHandler(authenticationSuccessHandlerImpl)
                .failureHandler(authenticationFailureHandlerImpl)
                .and()
                .userDetailsService(userDetailsService)
                .sessionManagement()
                .invalidSessionUrl("/session/invalid")
//                .maximumSessions(1) //同时存在最大session数为1
//                .maxSessionsPreventsLogin(true) //当session达到最大数量后 阻止后面用户登录
//                .expiredSessionStrategy(new ExpiredSessionStrategyImpl()) //实现谁踢掉后记录, 有个事件
//                .and()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(logoutSuccessHandler)
                .and()
                .authorizeRequests()//下面的请求
                .antMatchers(permitAll).permitAll()//放过这个URL-直接放行
                .anyRequest()   //所有的请求
                .authenticated() //都需要认证
                .and()
                .csrf().disable();
    }
}