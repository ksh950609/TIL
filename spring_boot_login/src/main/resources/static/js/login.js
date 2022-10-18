/**
 *  checkForm.js : 폼 유효성 확인
 */
 
/**
 * login.js
 */
$(document).ready(function(){
 $('#loginForm').on('submit', function()
{ // submit 이벤트 기본 기능 : 페이지 새로 고침 
// 기본 기능 중단 
event.preventDefault(); 
$.ajax({ 
type: "post", 
url: "loginForm", 
data: { "id" : $('#id').val(), 
"pwd" :$('#pwd').val()}, 
dataType: "text", 
success: function(result){ // 성공 시 수행되는 함수 : 반환되는 값을 result로 받음 
if(result == "success"){ 
alert("login ok"); location.href="/loginForm"; }
else{ alert("login fail"); } }, 
error: function(){ // 오류 있을 경우 수행되는 함수 
alert("전송 실패"); } }); 
// ajax 끝
 }); 
 // submit 끝 
 });










