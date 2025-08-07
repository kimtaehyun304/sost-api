### 소개
<ul>
  <li>축구 4대 리그 정보 제공 (선수와 팀의 전적·통계·랭킹)</li>
  <li>리그 데이터는 외부 API (rapid-api) 사용</li>
  <li>팀원 4명 중 혼자 백엔드 담당</li>
  <li>개발 기간: 2024-09-10 ~ 12-10</li>
</ul>

### 프로젝트 스킬
<ul>
  <li>spring (boot3·security6) / hibernate6 / swagger / aws</li>
</ul>

### 프로젝트로 얻은 경험
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

성능 개선
<ul>
   <li>
     <a href="https://github.com/kimtaehyun304/sost-api/blob/5acbcb8163d1c741e482bd000a243c54318e63af/src/main/java/com/daelim/sfa/InitDb.java#L499">
        단건 조회를 차집합 조회로 변경하여, 배치 작업 속도 개선 (4H → 1H)
     </a>
   </li>
  <li>contains 성능을 위해 List 대신 Set 사용</li>
  <li>배치 작업 속도 개선을 위해, 클래스 레벨에 @Transactional 적용</li>
  
</ul>

    
### 기타
<ul>
  <li>지금 코드는 bindingResult 사용 중 → 공통 예외처리로 바꾸자</li>
</ul>




