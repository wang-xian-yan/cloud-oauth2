package org.ziyan.cloud.oauth2.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * @author wangxian
 * @date 2019/8/21 19:51
 */
@Component
@Slf4j
public class CustomerAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        log.info("[authenticate] begin username:{},password:{}",authentication.getName(),authentication.getPrincipal());
        return new UsernamePasswordAuthenticationToken(authentication.getName(),authentication.getPrincipal());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
