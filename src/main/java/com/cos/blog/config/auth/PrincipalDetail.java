package com.cos.blog.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.blog.model.User;

import lombok.Getter;

@Getter
public class PrincipalDetail implements UserDetails {

	private User user;

	public PrincipalDetail(User user) {
		this.user = user;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() { // 계정이 만료되지 않았는지 리턴 (true:만료안됨)
		return true;
	}

	@Override
	public boolean isAccountNonLocked() { // 계정이 잠겼는지 않았는지 리턴 (true:만료안됨)
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() { // 비밀번호가 만료되지 않았는지 리턴 (true:만료안됨)
		return true;
	}

	@Override
	public boolean isEnabled() { // 계정 활성화인지 리턴 (true:활성화)
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() { // 계정 권한 리턴
		Collection<GrantedAuthority> collectors = new ArrayList<>();
		collectors.add(new GrantedAuthority() {

			@Override
			public String getAuthority() {
				return "ROLE_" + user.getRole(); // ROLE_USER, ROLE_ADMIN
			}
		});

//		collectors.add(() -> { // 람다식
//			return "ROLE_" + user.getRole();
//		}); 

		return collectors;
	}

}
