## 👩‍💻 Tourmates-Server

<table align="center">
    <tr align="center">
        <td style="min-width: 150px;">
            <a href="https://github.com/Chaos0103">
              <img src="https://avatars.githubusercontent.com/u/85945540?v=4?s=100" width="200">
              <br />
              <b>Chaos0103</b>
            </a>
        </td>
        <td style="min-width: 150px;">
            <a href="https://github.com/youbeen2798">
              <img src="https://avatars.githubusercontent.com/u/62228401?s=400&u=089174174580bea711bdbcdd778fde51a726a9a8&v=4" width="200">
              <br />
              <b>youbeen2798</b>
            </a> 
        </td>
    </tr>
    <tr align="center">
        <td>
            임우택
        </td>
        <td>
            정유빈
        </td>
    </tr>
</table>

## ⚒️ 화면 구성

### 메인 화면
- 홈페이지 메인 화면 입니다. 
![image](https://user-images.githubusercontent.com/62228401/235670627-0409ac58-abfc-4015-a9be-aac1101eff1b.png)

### 회원관리
#### 로그인
- 로그인 페이지 입니다.
![image](https://user-images.githubusercontent.com/62228401/235670929-f226b3b3-0569-41d9-a862-d0ea5c58c942.png)

### 관광지 조회 화면
- 관광지 조회 화면입니다.
- 지도에 관광지 위치에 마크가 찍히고 사진과 함께 설명이 출력됩니다.
![image](https://user-images.githubusercontent.com/62228401/235671473-49501993-e892-4c34-aa5e-4ce325662701.png)
![image](https://user-images.githubusercontent.com/62228401/235671867-3ae66337-152a-45bc-aa0c-ccdbea930402.png)

## 마이페이지
- 마이페이지 화면입니다.
![image](https://user-images.githubusercontent.com/62228401/235674941-209fb326-d171-4ea6-81d2-fe8762e819c4.png)
- 로그인 한 유저가 본인의 정보를 확인할 수 있습니다.
![image](https://user-images.githubusercontent.com/62228401/235674387-5ddde011-1d87-4a56-b7d4-5ceacb78e00f.png)
- UPDATE 버튼을 누르면 개인 정보 수정이 가능합니다.
![image](https://user-images.githubusercontent.com/62228401/235674522-c81a5a48-c415-437f-a77d-07ecfb72f0bc.png)
- 비밀번호 버튼을 누르면 현재 비밀번호를 확인 후 새로운 비밀번호를 등록할 수 있습니다.
![image](https://user-images.githubusercontent.com/62228401/235675472-739993ae-4ee1-4663-b30c-14249c858e7d.png)
- 로그인 한 유저가 본인이 등록한 핫플레이스를 확인할 수 있습니다.
![image](https://user-images.githubusercontent.com/62228401/235675188-af5f3cf2-8dd3-4982-b867-81fa9fdbef87.png)


### 게시판 구현
- 자유게시판과 공지사항 게시판 입니다.

#### 자유게시판
- 자유게시판을 클릭하면 자유게시판 목록이 출력됩니다.
![image](https://user-images.githubusercontent.com/62228401/235678827-09374b4b-62f2-4cca-a6d3-98425745926d.png)
- 개시물을 한번 더 클릭하면 상세보기가 가능합니다.
![image](https://user-images.githubusercontent.com/62228401/235679492-45e7f1b7-59c8-4a0a-b649-474274e8824d.png)
- 목록, 수정, 삭제 버튼이 있으며, 수정 버튼을 누를 시 수정 화면으로 이동합니다.
![image](https://user-images.githubusercontent.com/62228401/235679689-d210c718-5975-4c5e-9ddd-7beced9c4f6c.png)

- 관리자 권한이 없어도 모든 이용자가 게시글 작성, 읽기 권한이 있습니다.
- 이용자는 자신이 쓴 글에대한 게시글 수정, 삭제 권한이 있습니다.
- 관리자는 모든 글에대한 삭제 권한이 있습니다.

### 공지사항
- 글쓰기 버튼을 누르면 아래와 같은 등록폼이 생깁니다.
![image](https://user-images.githubusercontent.com/62228401/235681459-da0c9819-3510-49d9-b085-1f7c8d1bce85.png)
- 등록을 완료 후 세부 사항 목록으로 이동합니다.
![image](https://user-images.githubusercontent.com/62228401/235687963-1f6bfaac-960c-4400-a554-fc41edcea579.png)
- 등록을 완료 후 목록을 확인하면 공지사항이 등록된 것을 알 수 있습니다.
![image](https://user-images.githubusercontent.com/62228401/235687738-5a25f14a-c1bf-4efd-a6dd-481b1ab54bc0.png)


#### 핫플레이스
- 핫플레이스 목록을 확인할 수 있는 페이지입니다.
![image](https://user-images.githubusercontent.com/62228401/235673656-b178536c-9a3d-4197-af0b-61a73fcec858.png)
- 사용자는 관광지 목록에서 방문했던 핫플레이스 등록을 할 수 있습니다.
![image](https://user-images.githubusercontent.com/62228401/235673534-1e090798-a0f8-477f-a0f8-1fd3f91521ec.png)

## ✅ 커밋 컨벤션

| 제목          | 내용                                              |
|-------------|-------------------------------------------------|
| init        | 작업 세팅 커밋 (패키지 설치 등)                             |
| feat        | 새로운 기능을 추가할 경우                                  |
| style       | 기능에 영향을 주지 않는 커밋, 코드 순서, css등의 포맷에 관한 커밋        |
| fix         | 버그를 고친 경우                                       |
| refactor    | 프로덕션 코드 리팩토링                                    |
| test        | 테스트 코드 작성                                       |
| docs        | 문서를 수정한 경우, 파일 삭제, 파일명 수정 등 ex) README.md       |
| chore       | 빌드 테스트 업데이트, 패키지 매니저를 설정하는 경우, 주석 추가, 자잘한 문서 수정 |
| code review | 코드 리뷰 반영                                        |

