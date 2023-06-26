/**
 * 
 */

 function joinCheck() {
	 if(document.join_frm.mid.value.length == 0) {
		 alert('아이디는 필수입력사항입니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 if(document.join_frm.mid.value.length <= 3) {
		 alert('아이디는 4자 이상이어야합니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 if(document.join_frm.mpw.value.length == 0) {
		 alert('비밀번호는 필수입력사항입니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 if(document.join_frm.mpw.value.length <= 3) {
		 alert('비밀번호는 4자 이상이어야합니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 if(document.join_frm.mpw.value != document.join_frm.mpw_check.value) {
		 alert('입력하신 비밀번호와 비밀번호 확인이 일치하지 않습니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 if(document.join_frm.mname.value.length == 0) {
		 alert('이름은 필수입력사항입니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 if(document.join_frm.memail.value.length == 0) {
		 alert('이메일은 필수입력사항입니다. 다시확인해 주세요.');
		 return false;
	 }
	 
	 document.join_frm.submit();
 }