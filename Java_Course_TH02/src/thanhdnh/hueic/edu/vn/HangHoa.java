package thanhdnh.hueic.edu.vn;

lớp  công khai HangHoa {
	private  string tenhang;
	// Continue for relase properties

	 chuỗi tư nhân ngaysanxuat;
	 dongia đôi riêng ;
	private  int soluong;

	public  String  getTenHang () {
		return tenhang;
	}

	public  void  setTenHang ( Chuỗi  th ) {
		tenhang = th;
	}
	// Continue for remaining method

	public  String  getNgaySanXuat () {
		trả lại ngaysanxuat;
	}

	public  void  setNgaySanXuat ( Chuỗi  nsx ) {
		ngaysanxuat = nsx;
	}

	công khai  double  getDonGia () {
		trả lại dongia;
	}

	public  void  setDonGia ( double  dg ) {
		dongia = dg;
	}

	public  int  getSoLuong () {
		return soluong;
	}

	public  void  setSoLuong ( int  sl ) {
		soluong = sl;
	}

	công khai  đôi  TinhTien () {
		return dongia * soluong;
	}

	 HangHoa công cộng ( Chuỗi  thứ , Chuỗi  nsx , double  dg , int  sl ) {
		tenhang = th;
		ngaysanxuat = nsx;
		dongia = dg;
		soluong = sl;
	}

	 HangHoa công cộng () {
	}

	@Ghi đè
	công khai  String  toString () {
		return  " Tên hàng: "  + tenhang +  " \ n "  +  " Ngày sản xuất: "  + ngaysanxuat +  " \ n "  +
				" Đơn giá: "  + dongia +  " \ n "  +  " Số lượng: "  + soluong +  " \ n "  +  " Thành tiền: "  + TinhTien (); }
}
