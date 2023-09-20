# 총 로그인 수 조회 API

## 구현 화면    
**HTTP Method 중 GET 방식으로 결과 값 조회**
  - 연별 로그인 수 조회    
  <img width="770" alt="year" src="https://github.com/vihiolet/springProject/assets/108925254/5d480169-8caf-4fcf-b7d8-477e678267ee">    

  - 월별 로그인 수 조회    
  <img width="809" alt="month" src="https://github.com/vihiolet/springProject/assets/108925254/d7f2e4ae-2e85-4d49-98eb-53df33f13f88">    

  - 일별 로그인 수 조회    
  <img width="886" alt="date" src="https://github.com/vihiolet/springProject/assets/108925254/3967fa90-c219-4b28-9a79-d3bb8c6ac1db">
<br><br>

## API 가이드
#### 1. 연별 로그인 수 조회
**기본정보**     
<table>
  <tr>
    <td>메서드</td>
    <td>URL</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>localhost:8038/loginhistory-year</td>
  </tr>
</table>    

**요청**
- Request Parameter
<table>
  <tr>
    <td>이름</td>
    <td>타입</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>year</td>
    <td>String</td>
    <td>연별 로그인 수를 전달 받을 값(연)</td>
  </tr>
</table>    

**응답**
- Response Parameter
<table>
  <tr>
    <td>이름</td>
    <td>타입</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>yearCnt</td>
    <td>String</td>
    <td>로그인 수 조회 값(연)</td>
  </tr>
  <tr>
    <td>year</td>
    <td>String</td>
    <td>전달 받은 값(연)</td>
  </tr>
  <tr>
    <td>code</td>
    <td>String</td>
    <td>통신 성공/실패 여부 Http Code</td>
  </tr>
  <tr>
    <td>message</td>
    <td>String</td>
    <td>통신 성공/실패 여부 메세지</td>
  </tr>
</table>  

**예제**
- Response Body    
{    
    'yearCnt' : '3',    
    'year' : '2023',    
    'code' : '200',    
    'message' : '성공'           
}    
  
#### 2. 월별 로그인 수 조회
**기본정보**     
<table>
  <tr>
    <td>메서드</td>
    <td>URL</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>localhost:8038/loginhistory-month</td>
  </tr>
</table>    

**요청**
- Request Parameter
<table>
  <tr>
    <td>이름</td>
    <td>타입</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>year</td>
    <td>String</td>
    <td>월별 로그인 수를 전달 받을 값(연)</td>
  </tr>
  <tr>
    <td>month</td>
    <td>String</td>
    <td>월별 로그인 수를 전달 받을 값(월)</td>
  </tr>
</table>    

**응답**
- Response Parameter
<table>
  <tr>
    <td>이름</td>
    <td>타입</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>year</td>
    <td>String</td>
    <td>전달 받은 값(연)</td>
  </tr>
  <tr>
    <td>month</td>
    <td>String</td>
    <td>전달 받은 값(월)</td>
  </tr>
  <tr>
    <td>code</td>
    <td>String</td>
    <td>통신 성공/실패 여부 Http Code</td>
  </tr>
  <tr>
    <td>message</td>
    <td>String</td>
    <td>통신 성공/실패 여부 메세지</td>
  </tr>
</table>       

**예제**
- Response Body    
{    
    'yearCnt' : '3',    
    'year' : '2023',
    'month' : '09',    
    'code' : '200',    
    'message' : '성공'           
}    

#### 3. 일별 로그인 수 조회
**기본정보**     
<table>
  <tr>
    <td>메서드</td>
    <td>URL</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>localhost:8038/loginhistory-date</td>
  </tr>
</table>    

**요청**
- Request Parameter
<table>
  <tr>
    <td>이름</td>
    <td>타입</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>year</td>
    <td>String</td>
    <td>연별 로그인 수를 전달 받을 값(연)</td>
  </tr>
  <tr>
    <td>month</td>
    <td>String</td>
    <td>연별 로그인 수를 전달 받을 값(월)</td>
  </tr>
  <tr>
    <td>date</td>
    <td>String</td>
    <td>연별 로그인 수를 전달 받을 값(일)</td>
  </tr>
</table>    

**응답**
- Response Parameter
<table>
  <tr>
    <td>이름</td>
    <td>타입</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>year</td>
    <td>String</td>
    <td>전달 받은 값(연)</td>
  </tr>
  <tr>
    <td>month</td>
    <td>String</td>
    <td>전달 받은 값(월)</td>
  </tr>
  <tr>
    <td>date</td>
    <td>String</td>
    <td>전달 받은 값(일)</td>
  </tr>
  <tr>
    <td>code</td>
    <td>String</td>
    <td>통신 성공/실패 여부 Http Code</td>
  </tr>
  <tr>
    <td>message</td>
    <td>String</td>
    <td>통신 성공/실패 여부 메세지</td>
  </tr>
</table>   

**예제**
- Response Body    
{    
    'dateCnt' : '3',    
    'year' : '2023',
    'month' : '09',
    'date' : '18',    
    'code' : '200',    
    'message' : '성공'           
}    

  
  
