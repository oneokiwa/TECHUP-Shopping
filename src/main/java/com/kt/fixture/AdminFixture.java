package com.kt.fixture;

import com.kt.domain.entity.AdminEntity;
import com.kt.constant.Gender;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Profile("local")
public class AdminFixture {

	private final PasswordEncoder passwordEncoder;

	public AdminEntity admin() {
		return AdminEntity.create(
			"관리자",
			"admin@example.com",
			passwordEncoder.encode("Test1234!"),
			Gender.MALE
		);
	}

}
