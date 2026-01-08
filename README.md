
</aside>

# 🛒 TECHUP Shopping

## 개요

Spring Boot 기반의 전자상거래 플랫폼으로, **상품 관리** · **주문 처리** · **회원 관리** 등 <br/>
온라인 쇼핑몰의 핵심 기능을 제공합니다.

<br/>

## 개발 기간 및 팀 구성

- 2025.11.17 - 2025.12.2

  
<div align="center">
    
|                                     황준상(팀장)                                      |                                         이세현                                         |                                                                 김도현                                                                  |                                         최민서                                         |                                         이정수                                         |
| :-----------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: |
| <img src="https://avatars.githubusercontent.com/u/89866144?v=4" width=150 height=150> | <img src="https://avatars.githubusercontent.com/u/238131178?v=4" width=150 height=150> | <img src="https://avatars.githubusercontent.com/u/142032659?s=400&u=0665c426ebddb8b09fff53e6749f124cf531ffa0&v=4" width=150 height=150> | <img src="https://avatars.githubusercontent.com/u/114375668?v=4" width=150 height=150> | <img src="https://avatars.githubusercontent.com/u/164000692?v=4" width=150 height=150> |
|                     [@junsang-ee](https://github.com/junsang-ee)                      |                      [@tryterry77](https://github.com/tryterry77)                      |                                                  [@l-lyun](https://github.com/l-lyun)                                                   |                        [@oneokiwa](https://github.com/oneokiwa)                        |                           [@FA-50](https://github.com/FA-50)                           |


</div>

<br/>

## 주요 기능

### 👤 사용자 관리

- 회원가입(이메일 인증)
- 로그인/로그아웃 (JWT)
- 회원 정보 수정

### 🛍️ 상품 관리

- 상품 카테고리별 조회
- 상품 검색 및 필터링
- 상품 상세 정보 조회
- 상품 리뷰 시스템

### 🛒 주문 관리

- 주문서 작성 및 주문 하기
- 주문 내역 조회 및 관리
- 주문 상태 추적

### 👨‍💼 관리자 기능

- 상품 등록/수정/삭제
- 주문 관리
- 사용자 관리

<br/>

## 사용 기술 및 도구

### **📚 Backend**

- Java 21
- Spring Boot 3.5.7
- Spring Data JPA, QueryDSL
- Spring Security (JWT)
- MySQL, Redis

### **🔨 DevOps / Tools**

- ERDCloud
- Swagger, Postman
- GitHub Issues / Projects
- Slack, Discord

<br/>

## 🚀 설치 및 실행

### **Docker 실행**

```bash
docker-compose up -d
```

### Backend 설정

```bash
git clone https://github.com/Team-GoFive/TECHUP-Shopping.git TECHUP-Shopping

cd TECHUP-Shopping

cp src/main/resources/application.yml.example src/main/resources/application.yml
```

.env, .env.test 파일 경로 설정 적용 및
`application.yml` 환경 설정 후

```
./gradlew bootRun
```

<br/>

## **📚 API 문서**

API 문서는 Swagger UI를 통해 확인할 수 있습니다.

[**http://localhost:8080/swagger-ui/index.html**](http://localhost:8080/swagger-ui/index.html)

<br/>

# **🗄️ ERD**

https://www.erdcloud.com/d/LcaWrdMaqyqp7yw9Z

### **주요 테이블**

| **테이블명**    | **설명**       |
| --------------- | -------------- |
| account         | 계정 정보      |
| courier         | 배송 기사 정보    |
| user            | 사용자 정보  |
| address         | 사용자 배송지 정보      |
| category        | 상품 카테고리 |
| product         | 상품           |
| review          | 리뷰           |
| order           | 주문 정보      |
| order_product   | 주문 상품  |
| payment         | 결제 정보      |
| shipping_detail | 배송 정보      |
| cart            | 장바구니       |


<br/>

# **🔧 환경 변수**

```bash
# Database
SPRING_DATASOURCE_URL=localhost
SPRING_DATASOURCE_PASSWORD=1234

# email
MAIL_USER_NAME=test@test.com
MAIL_PASSWORD=1234

# JWT
JWT_SECRET=kt-cloud-tech-up-shopping-202511171107
JWT_ACCESS_TIME=30m
JWT_REFRESH_TIME=24h

# redis
REDIS_PORT= 6379

# aes
ENCRYPT_KEY=TECH-UP-Shopping-Encrypt-key-AES
```
