/*
joinOkBtn 클릭하면
이메일, 비빌번호,이름의 유효성검사 실행
하나라도 공백이 있으면 함수를 중단하고
해당 input에 다시 포커스를 이동해서
다시 입력 하고 모든 유효성 검사를 통과하면
form의 회원가입 정보를 joinOk.do  보내줄수
 있도록 프로그래밍
 *** type="submit" -> 무조건 실행
 -> 기본 이벤트를 중지
*/
const joinOkBtn=document.querySelector('#joinOkBtn');
const joinForm=document.querySelector('#joinForm');
              // joinOkBtn -> 클릭 -> joinOkFn 함수 호출
joinOkBtn.addEventListener('click',joinOkFn);

// 함수 joinOkFn
function joinOkFn(event){
  //기본이벤트 중지 -> type="submit"
  event.preventDefault();
  //console.log(event.target)
  const email=document.querySelector('#email');
  const password=document.querySelector('#password');
  const name=document.querySelector('#name');
  //공란이거나 값이 없으면
  if(email.value=='' || email.value.length<=0){
    alert('이메일 입력 오류!! 다시 입력해주세요');
    email.focus();// 포커스 이동
    return false; // 함수 종료 -> 아래 명령문 실행 X
  }
  if(password.value=='' || password.value.length<=0){
    alert('password 입력 오류!! 다시 입력해주세요');
    password.focus();// 포커스 이동
    return false; // 함수 종료 -> 아래 명령문 실행 X
  }  
  if(name.value=='' || name.value.length<=0){
    alert('name 입력 오류!! 다시 입력해주세요');
    name.focus();// 포커스 이동
    return false; // 함수 종료 -> 아래 명령문 실행 X
  }
  
  alert("회원가입 실행~~");
  //  action="joinOk.do"  form의 사용자 입력 data를 전송
  joinForm.submit();

}