# Calculator (Spring Boot)

Java 17 및 Spring Boot 기반의 간단한 계산기 웹 애플리케이션입니다. 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하며, Docker 컨테이너로 배포할 수 있습니다. 또한, JUnit 5 기반의 단위 테스트가 포함되어 있어 기능 검증이 가능합니다.

---

## 🛠️ 기술 스택
- Java 17
- Spring Boot
- Gradle
- Docker
- JUnit 5 (단위 테스트)
- Jenkins (선택적 CI/CD)

---

## 🚀 제공 기능
- 덧셈: `sum(int a, int b)`
- 뺄셈: `sub(int a, int b)`
- 곱셈: `mul(int a, int b)`
- 나눗셈: `div(int a, int b)`

> 모든 연산 기능은 `Calculator` 서비스 클래스에서 제공됩니다.

---

## 📁 디렉토리 구조
```
calculator/
├── Dockerfile
├── Jenkinsfile
├── build.gradle
├── settings.gradle
├── src/
│   ├── main/
│   │   └── java/com/Web/Calculator/
│   │       ├── Calculator.java              # 계산 기능
│   │       └── CalculatorApplication.java   # SpringBoot 실행부
│   └── test/
│       └── java/com/Web/Calculator/
│           ├── CalculatorTest.java          # 계산기 기능 단위 테스트
│           └── CalculatorApplicationTests.java # context 로딩 테스트
```

---

## ✅ 테스트

### CalculatorTest.java
```java
@Test
public void testSum() {
    assertEquals(5, calculator.sum(2, 3));
}
```
기능별 단위 테스트가 JUnit 5를 기반으로 작성되어 있습니다. 테스트는 아래 명령어로 수행할 수 있습니다:
```yaml
./gradlew test
```
테스트 결과는 `build/reports/tests/test/index.html` 에서 확인할 수 있습니다.

---

## 🐳 Docker 사용법

### 1.빌드 및 실행 
```bash
# 프로젝트 클론
git clone https://github.com/gachaemin/calculator.git
cd calculator

# 애플리케이션 빌드
./gradlew build

# Docker 이미지 빌드
docker build -t calculator-app .

# Docker 컨테이너 실행
docker run -p 8080:8080 calculator-app
```

> Spring Boot 기본 포트는 `8080`입니다.
