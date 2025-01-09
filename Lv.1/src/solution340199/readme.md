## [PCCE 기출문제] 9번 / 지폐 접기
문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/340199?language=java
> 출처 : 프로그래머스 코딩테스트 연습 > 연습 문제 > [PCCE 기출문제] 9번 / 지폐 접기

### 풀이
1. 지폐가 지갑에 들어가는지 확인
   1. 지갑에 들어간다면 접은 횟수 return
   2. 지갑에 들어가지 않는다면 긴 쪽을 반틈 접기
지갑에 들어갈 때까지 반복

### 기능
- [x] 긴 쪽을 반틈 접는 기능
- [x] 지폐가 지갑에 들어가는지 판단 기능

### 새롭게 배운 점
여러 개의 assertThat();을 사용할 땐, assertAll();로 묶어서 사용  
**사용법**  
1. import static org.junit.jupiter.api.Assertions.assertAll;를 임포트
2. assertThat( () -> assertThat(actual).isEqualTo(), ~ ) 와 같이 사용