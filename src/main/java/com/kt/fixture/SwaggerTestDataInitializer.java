package com.kt.fixture;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.kt.domain.entity.*;
import com.kt.repository.*;
import com.kt.repository.admin.AdminRepository;
import com.kt.repository.product.ProductRepository;
import com.kt.repository.seller.SellerRepository;
import com.kt.repository.user.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@Profile("local")
@RequiredArgsConstructor
public class SwaggerTestDataInitializer implements ApplicationRunner {

	private final AdminRepository adminRepository;
	private final UserRepository userRepository;
	private final SellerRepository sellerRepository;
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	private final AddressRepository addressRepository;

	private final AdminFixture adminFixture;
	private final UserFixture userFixture;
	private final SellerFixture sellerFixture;


	@Override
	public void run(ApplicationArguments args) {

		AdminEntity admin = adminRepository.save(adminFixture.admin());
		UserEntity user = userRepository.save(userFixture.user());
		SellerEntity seller = sellerRepository.save(sellerFixture.seller());

		CategoryEntity category =
			categoryRepository.save(CategoryFixture.defaultCategory());

		ProductEntity product =
			productRepository.save(ProductFixture.product(category, seller));

		AddressEntity address =
			addressRepository.save(AddressFixture.address(user));
	}
}
