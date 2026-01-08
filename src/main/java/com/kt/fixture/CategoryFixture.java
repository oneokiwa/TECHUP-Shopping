package com.kt.fixture;

import com.kt.domain.entity.CategoryEntity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public final class CategoryFixture {

	private CategoryFixture() {}

	public static CategoryEntity defaultCategory() {
		return CategoryEntity.create(
			"TEST_CATEGORY",
			null
		);
	}
}