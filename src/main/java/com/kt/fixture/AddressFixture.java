package com.kt.fixture;

import com.kt.domain.entity.AddressEntity;
import com.kt.domain.entity.UserEntity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public final class AddressFixture {

	private AddressFixture() {}

	public static AddressEntity address(UserEntity user) {
		return AddressEntity.create(
			user.getName(),
			"010-1111-0000",
			"서울특별시",
			"강남구",
			"테헤란로",
			"101호",
			user
		);
	}
}
