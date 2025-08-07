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
스케줄러를 통한 배치 작업 (@Schedule)
<ul>
  <li>매일 외부 api 100회 호출하여 db 2000건 수정</li>
  <li>배치 작업 속도 개선 (RDS 통신 4H → 1H) </li>
    <ul>
      <li>중복 검사를 위해 팀 ID별로 DB를 개별 조회 -> 차집합 연산으로 DB에 없는 팀만 선별</li>
    </ul>
  <li>EC2 시간이 UTC로 돼있어서 의도치 않은 시간에 동작 → KST로 변경</li>
  <li>연합뉴스 크롤링하여 db 저장</li>

</ul>
    
### 기타
<ul>
  <li>지금 코드는 bindingResult 사용 중 → 공통 예외처리로 바꾸자</li>
</ul>




