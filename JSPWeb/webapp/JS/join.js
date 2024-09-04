function check_ok() {
	if (document.reg_frm.name.value.length == 0) {
		alert("이름를 입력해주세요.");
		document.reg_frm.name.focus();
		return false;
	}

	if (document.reg_frm.rrn1.value.length != 6) {
		alert("주민번호 앞 숫자는 6글자여야합니다.");
		document.reg_frm.rrn1.focus();
		return false;
	}

	if (document.reg_frm.rrn2.value.length != 7) {
		alert("주민번호 뒷 숫자는 7글자여야합니다.");
		document.reg_frm.rrn2.focus();
		return false;
	}

	if (document.reg_frm.id.value == "") {
		alert("아이디를 입력해주세요.");
		document.reg_frm.id.focus();
		return false;
	}

	if (document.reg_frm.id.value.length < 4) {
		alert("아이디는 4글자 이상이어야합니다.");
		document.reg_frm.id.focus();
		return false;
	}

	if (document.reg_frm.pwd.value == "") {
		alert("패스워드는 반드시 입력해주세요.");
		document.reg_frm.pwd.focus();
		return false;
	}

	if (document.reg_frm.pwd.value != document.reg_frm.pwd_chk.value) {
		alert("패스워드가 일치하지 않습니다.");
		document.reg_frm.pwd_chk.focus();
		return false;
	}

	return true;

}
