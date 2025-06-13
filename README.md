Tên đề tài : Xây dựng phần mềm quản lí kho hàng 
1. Mô phỏng hệ thống (dự án)
 ![image](https://github.com/user-attachments/assets/c2c493ab-cc8d-40d1-b423-8a2e008d202a)

Phần mềm quản lý kho hàng là một hệ thống gồm nhiều chức năng hỗ trợ quản lý xuất - nhập hàng, sản phẩm, danh mục và tài khoản người dùng. Dưới đây là mô phỏng tổng thể của hệ thống:

1.1 Kiến trúc hệ thống
Tầng giao diện người dùng: Giao diện đăng nhập, giao diện chính (admin và nhân viên), quản lý sản phẩm, danh mục, phiếu nhập, phiếu xuất, thống kê doanh thu.
Tầng xử lý nghiệp vụ: Kiểm tra đăng nhập, xử lý CRUD cho danh mục/sản phẩm/phiếu/tài khoản, tính toán thống kê.
Tầng cơ sở dữ liệu:
Bảng User: lưu thông tin người dùng, quyền truy cập
Bảng SanPham, DanhMuc, PhieuNhap, PhieuXuat: quản lý kho hàng và phiếu giao dịch
Dữ liệu kết nối với các chức năng báo cáo và thống kê
2. Đặc tả tính sử dụng, chức năng người sử dụng
Tính sử dụng (Usability):
Giao diện phần mềm thân thiện, dễ sử dụng cho cả người quản trị và nhân viên.
Các chức năng được phân tách rõ ràng, dễ hiểu, giúp người dùng thao tác nhanh chóng.
Chức năng người sử dụng:
Quản trị viên (Admin):
Đăng nhập / Đăng xuất
Quản lý tài khoản người dùng
Quản lý danh mục, sản phẩm, phiếu nhập, phiếu xuất
Thống kê doanh thu
Nhân viên:
Đăng nhập / Đăng xuất
Quản lý danh mục, sản phẩm
Tạo phiếu nhập, xuất
Xem thống kê doanh thu
3. Mô tả quy trình đánh giá
Hình thức đánh giá: Thông qua test case và thử nghiệm chức năng thực tế.
Người thực hiện: Các thành viên nhóm phụ trách từng chức năng cụ thể.
Nội dung kiểm thử gồm:
Đăng nhập
Thêm/sửa/xóa danh mục, sản phẩm
Thao tác với phiếu nhập, phiếu xuất
Quản lý tài khoản
Thống kê doanh thu
Xuất file Excel
Kết quả: Tất cả test case chính đều thành công, giao diện hoạt động ổn định.
4.ác thay đổi cần thiết trong thiết kế giao diện và chương trình
4.1 Giao diện
Một số giao diện còn đơn giản, bố cục chưa hợp lý.
Nên bổ sung thêm màu sắc, biểu tượng giúp người dùng dễ thao tác hơn.
Tách rõ phần quản trị và nhân viên, tránh nhầm lẫn.
4.2 Chương trình
Bổ sung kiểm tra dữ liệu đầu vào (ràng buộc đầu vào, validate form).
Tối ưu mã nguồn xử lý khi danh sách lớn (nhập hàng loạt sản phẩm).
Hoàn thiện tính năng gửi báo cáo qua email như đã đề xuất. 
5.Kết luận
Đề tài đã hoàn thiện với đầy đủ các chức năng cơ bản của một hệ thống quản lý kho.
Hệ thống giúp:
Giảm thiểu thời gian thao tác thủ công
Tăng độ chính xác trong theo dõi hàng hóa
Hỗ trợ báo cáo và thống kê theo kỳ
Nhóm đã áp dụng thành công kiến thức từ môn Kỹ thuật Phần mềm để xây dựng ứng dụng thực tế.
Tuy nhiên, do thời gian có hạn và nhóm chưa có kinh nghiệm chuyên sâu, một số tính năng vẫn cần hoàn thiện thêm.
Trong tương lai, nhóm sẽ phát triển thêm: bảo mật, giao diện chuyên nghiệp hơn và mở rộng tính năng tự động hoá báo cáo.
