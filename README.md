Tên đề tài : Xây dựng phần mềm quản lí kho hàng 
1. Mô phỏng hệ thống (dự án)
 ![image](https://github.com/user-attachments/assets/c2c493ab-cc8d-40d1-b423-8a2e008d202a)

Phần mềm quản lý kho hàng là một hệ thống gồm nhiều chức năng hỗ trợ quản lý xuất - nhập hàng, sản phẩm, danh mục và tài khoản người dùng. Dưới đây là mô phỏng tổng thể của hệ thống:

1. Mở đầu
Kính thưa thầy và các bạn,

Trong bối cảnh chuyển đổi số đang diễn ra mạnh mẽ, việc ứng dụng CNTT vào quản lý kho hàng là xu hướng tất yếu. Với mục tiêu vận dụng kiến thức đã học vào một sản phẩm thực tiễn, nhóm 8 chúng em đã lựa chọn đề tài "Xây dựng phần mềm quản lý kho hàng bằng Java", dưới sự hướng dẫn của thầy Vũ Quang Dũng.

2. Kiến trúc hệ thống
![image](https://github.com/user-attachments/assets/e7cf94f7-1583-463b-9c6e-ae2a757f6b1f)
![image](https://github.com/user-attachments/assets/dd8a2718-8a98-4be0-af32-21b5a1fa4513)
![image](https://github.com/user-attachments/assets/898b0b1d-5818-4a4d-bc75-73661224bd17)



Phần mềm được xây dựng theo mô hình 3 lớp (3-tier) gồm:

🔷 Tầng giao diện người dùng (UI):
Gồm các màn hình như đăng nhập, giao diện chính cho admin và nhân viên, quản lý sản phẩm, danh mục, phiếu nhập, phiếu xuất và thống kê doanh thu. Giao diện thiết kế đơn giản, dễ sử dụng.

🔷 Tầng xử lý nghiệp vụ (Business Logic):
Đảm nhận các chức năng xử lý chính như đăng nhập, phân quyền, CRUD dữ liệu, tính toán thống kê...

🔷 Tầng cơ sở dữ liệu (Database):
Các bảng chính bao gồm:

User: lưu thông tin người dùng

SanPham, DanhMuc: quản lý sản phẩm theo từng danh mục

PhieuNhap, PhieuXuat: quản lý các giao dịch nhập – xuất hàng

Các bảng này liên kết chặt chẽ với các chức năng báo cáo và thống kê.

3. Tính sử dụng và chức năng người dùng
🔹 Tính sử dụng (Usability):

Giao diện thân thiện, rõ ràng.

Các chức năng phân tách logic, giúp thao tác nhanh chóng.

Giao diện phù hợp cho cả người quản trị và nhân viên.

🔹 Phân quyền chức năng:

Admin có thể:

Đăng nhập/đăng xuất

Quản lý tài khoản, danh mục, sản phẩm, phiếu nhập/xuất

Thống kê doanh thu

Nhân viên có thể:

Đăng nhập/đăng xuất

Quản lý danh mục, sản phẩm

Tạo phiếu nhập, xuất

Xem thống kê doanh thu

4. Quy trình kiểm thử và đánh giá
🔍 Phương pháp đánh giá:

Sử dụng test case cụ thể để kiểm tra từng chức năng.

Mỗi thành viên phụ trách một phần chức năng thực hiện test tương ứng.

🧪 Nội dung kiểm thử:

Đăng nhập hệ thống

Thêm/sửa/xóa danh mục và sản phẩm

Quản lý phiếu nhập/xuất

Quản lý tài khoản

Thống kê doanh thu

Xuất dữ liệu ra Excel

✅ Kết quả:

Tất cả test case đều đạt kết quả thành công, phần mềm hoạt động ổn định.

5. Góp ý & cải tiến cần thiết
5.1 Giao diện:
Một số bố cục chưa tối ưu, còn đơn điệu.

Cần bổ sung thêm biểu tượng, màu sắc để cải thiện trải nghiệm người dùng.

Tách rõ giao diện admin và nhân viên để tránh nhầm lẫn.

5.2 Về chương trình:
Cần validate dữ liệu đầu vào kỹ hơn để tránh lỗi.

Tối ưu hiệu năng khi làm việc với danh sách lớn hoặc nhập hàng loạt.

Tích hợp tính năng gửi báo cáo qua email để tự động hóa quy trình.

6. Kết quả đạt được
✅ Nhóm đã:

Nắm vững quy trình phát triển phần mềm qua môn Kỹ thuật Phần mềm.

Hiểu và thực hành thiết kế hệ thống theo mô hình UML.

Thiết kế cơ sở dữ liệu logic, phù hợp với thực tế quản lý kho.

Xây dựng phần mềm hoàn chỉnh với giao diện và các chức năng thiết yếu.

📈 Phần mềm hỗ trợ:

Giảm thời gian nhập liệu thủ công

Quản lý sản phẩm, danh mục, xuất nhập hàng chính xác

Thống kê doanh thu rõ ràng theo từng kỳ

7. Hạn chế & hướng phát triển
❌ Hạn chế:

Giao diện còn đơn giản

Một số tính năng mới chỉ dừng ở mức demo

Thiếu tính năng nâng cao như cảnh báo tồn kho thấp

🚀 Hướng phát triển tương lai:

Hoàn thiện giao diện chuyên nghiệp hơn

Tích hợp chức năng gửi báo cáo định kỳ qua email

Thêm tính năng bảo mật cao hơn (xác thực hai lớp, mã hóa mật khẩu)

Mở rộng quy mô: hỗ trợ nhiều chi nhánh/kho hàng

Hướng đến triển khai thực tế tại các cơ sở kinh doanh vừa và nhỏ

8. Lời kết
Đề tài đã giúp nhóm chúng em không chỉ củng cố kiến thức lý thuyết mà còn phát triển kỹ năng làm việc nhóm, lập trình hướng đối tượng, thiết kế hệ thống và kiểm thử phần mềm.

Chúng em xin gửi lời cảm ơn chân thành đến thầy Vũ Quang Dũng đã tận tình hướng dẫn, và kính mong nhận được góp ý từ thầy và các bạn để nhóm hoàn thiện sản phẩm hơn trong tương lai.

Xin trân trọng cảm ơn!

demo dự án 
![image](https://github.com/user-attachments/assets/260359cb-5a12-43a6-a72b-24b78b524276)

![image](https://github.com/user-attachments/assets/89ce4e68-82f8-49fa-bf66-03fa091979c0)

![image](https://github.com/user-attachments/assets/595c52ca-70ef-4611-b559-12d8ed51ea00)

![image](https://github.com/user-attachments/assets/882164d5-1f1e-4965-85bc-dcdda8a8a58a)

![image](https://github.com/user-attachments/assets/d94065e5-d05e-4e7c-8a87-1de44194e435)







