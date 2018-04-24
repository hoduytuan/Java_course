package thanhdnh.hueic.edu.vn;

lớp  công khai KhachHang {
	 tên người dùng String riêng ;
	// Continue for other attributes

	 mật khẩu String riêng ;

	public  String  getUsername () {
		tên người dùng trả về ;
	}

	công  trống  setUsername ( Chuỗi  USN ) {
		username = usn;
	}
	// Continue for method

	public  String  getPassword () {
		trả lại mật khẩu;
	}

	public  void  setPassword ( Chuỗi  pw ) {
		mật khẩu = pw;
	}

	công  KhachHang ( Chuỗi  USN , Chuỗi  pw ) {
		username = usn;
		mật khẩu = pw;
	}

	công  KhachHang () {
		username =  " admin " ;
		password =  " admin " ;
	}

	public  void  MuaHang ( Chuỗi  th , Chuỗi  nsx , double  dg , int  sl ) {
			HangHoa hh =  HangHoa mới  ();
			hh . setTenHang (th);
			hh . setNgaySanXuat (nsx);
			hh . setDonGia (dg);
			hh . setSoLuong (sl);
			hh . TinhTien ();
			Hệ thống . ra ngoài . println (hh . toString ());
		}
}
