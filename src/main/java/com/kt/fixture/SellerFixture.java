package com.kt.fixture;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.kt.constant.Gender;
import com.kt.domain.entity.SellerEntity;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Profile("local")
public class SellerFixture {

	private final PasswordEncoder passwordEncoder;

	public SellerEntity seller() {
		return SellerEntity.create(
			"셀러",
			"seller@example.com",
			passwordEncoder.encode("Test1234!"),
			"스토어1호",
			"010-0000-0000",
			Gender.MALE
		);
	}
}
