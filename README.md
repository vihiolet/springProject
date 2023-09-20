# 총 로그인 수 조회 API

## 구현 화면    
**HTTP Method 중 GET 방식으로 결과 값 조회**
  - 년별 로그인 수 조회    
  <img width="770" alt="year" src="https://github.com/vihiolet/springProject/assets/108925254/5d480169-8caf-4fcf-b7d8-477e678267ee">    

  - 월별 로그인 수 조회    
  <img width="809" alt="month" src="https://github.com/vihiolet/springProject/assets/108925254/d7f2e4ae-2e85-4d49-98eb-53df33f13f88">    

  - 일별 로그인 수 조회    
  <img width="886" alt="date" src="https://github.com/vihiolet/springProject/assets/108925254/3967fa90-c219-4b28-9a79-d3bb8c6ac1db">
<br><br>

## API 가이드
**년별 로그인 수 조회**
- URL : calhost:8038/loginhistory-year
- RequestParameter
  <table>
    <tr>
      <td>요청</td>
      <td>타입</td>
    </tr>
    <tr>
      <td>year</td>
      <td>String</td>
    </tr>
  </table>    
- Response Body
  <table>
    <tr>
      <td>요청</td>
      <td>타입</td>
    </tr>
    <tr>
      <td>year</td>
      <td>String</td>
    </tr>
    <tr>
      <td>code</td>
      <td>String</td>
    </tr>
  </table>   
