package org.ziyan.cloud.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 授权服务器
 * @author wangx
 *
 */
@EnableAuthorizationServer
@Configuration
public class Oauth2ServerConfig extends AuthorizationServerConfigurerAdapter{

}
