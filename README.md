<h1>해외 축구 리그 통계/ 2024.09 ~ 12</h1>

### 담당 역할 (팀 프로젝트)
* 혼자 백엔드 담당
* 팀장 맡음

### 구조
* 해외 축구 4대 리그 통계 제공 (프리미어 리그·라리가·세리에A·분데스리가)
* 데이터는 rapid api 사이트에서 구매 (데이터에 맞게 mysql 설계)
* 시즌 기간 동안에는 매일 업데이트
* 연합 뉴스 매일 크롤링
* cors 설정 (WebMvcConfigurer addCorsMappings)
* 필터 체인 → 컨트롤러 (컨트롤러에서 jwt 추출)

### 기술
* 스프링 부트3 (security6, jpa6, valid)
* jsoup, swagger
* aws(ec2·rds)

### 트러블 슈팅
스케줄러 작업 (@Schedule)
<ul>
  <li>
    <a href="https://github.com/kimtaehyun304/sost-api/blob/a7de49b8869b961db8d5696ae44aeb2a40a59ddc/src/main/java/com/daelim/sfa/ScheduledTasks.java#L104">
      매일 외부 api 100회 호출하여 db 2000건 수정
    </a>
  </li>
  <li>연합뉴스 크롤링하여 db 저장</li>
  <li>EC2 시간대가 UTC라 스케줄러도 UTC 기준으로 실행됨 → KST로 변경</li>
</ul>

배치 작업 속도 개선
<ul>
   <li>
     <a href="https://github.com/kimtaehyun304/sost-api/blob/5acbcb8163d1c741e482bd000a243c54318e63af/src/main/java/com/daelim/sfa/InitDb.java#L499">
        단건 조회 반복을 차집합 조회로 변경하여, 배치 작업 속도 개선 (4H → 1H)
     </a>
   </li>
  <li>컬렉션 contains 메서드 성능을 위해 컬렉션 자료구조 변경 (List → Set)</li>
  <li>배치 작업 UPDATE 트랜잭션 절약을 위해 트랜잭션 하나 사용</li>
</ul>

### 기타
<ul>
  <li>putty·fileZilla로 수동 배포 (현재 배포 중단)</li>
  <li>현재 코드는 bindingResult 사용 중 → 공통 예외처리로 바꿔야 함</li>
</ul>

### API
<ul>
  <li>리그 정보 조회</li>
  <li>이번 주 경기 일정 조회</li>
  <li>선수·팀 상세 및 통계</li>
  <li>선수·팀 검색</li>
  <li>선수·팀 랭킹 조회</li>
  <li>선수·팀 리뷰 조회·등록</li>
  <li>팀 스쿼드·포메이션 조회</li>
  <li>연합 뉴스 축구 기사 조회 (하루에 한번 크롤링)</li>  
</ul>

### erd
<p align="center">
<img src="https://github.com/user-attachments/assets/d77f9d4e-2029-42d5-97f7-37949068655b"/>
</p>

