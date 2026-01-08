package com.kt.fixture;

import java.time.LocalDate;

import com.kt.constant.AccountRole;
import com.kt.constant.Gender;
import com.kt.domain.entity.UserEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Profile("local")
public final class UserFixture {

	private final PasswordEncoder passwordEncoder;

	public UserEntity user() {
		return UserEntity.create(
			"일반유저",
			"user@example.com",
			passwordEncoder.encode("Test1234!"),
			AccountRole.MEMBER,
			Gender.MALE,
			LocalDate.of(1995, 1, 1),
			"010-1111-0000"
		);
	}
}
