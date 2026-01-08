package com.kt.fixture;

import com.kt.domain.entity.CategoryEntity;
import com.kt.domain.entity.ProductEntity;
import com.kt.domain.entity.SellerEntity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@Profile("local")
public final class ProductFixture {

	private ProductFixture() {}

	public static ProductEntity product(
		CategoryEntity category,
		SellerEntity seller
	) {
		return ProductEntity.create(
			"TEST_PRODUCT",
			10_000L,
			category,
			seller
		);
	}
}
