function toggleForm(formId) {
    var form = document.getElementById(formId);
    if (form.style.display === "none" || form.style.display === "") {
        form.style.display = "block";
        if (formId === 'themKhachHangForm') {
            document.getElementById('suaNguoiDungForm').style.display = 'none';
            document.getElementById('chiTietNguoiDungForm').style.display = 'none';
        } else {
            form.style.display = "none";
        }
    }
}

function xoaNguoiDung(mand) {
    if (confirm('Bạn có chắc chắn muốn xóa người dùng này?')) {
        // Gửi yêu cầu xóa người dùng
        fetch('/nguoidung/xoa/' + mand, {
            method: 'DELETE'
        })
        .then(response => {
            if (response.ok) {
                // Reload lại trang sau khi xóa
                window.location.reload();
            } else {
                alert('Xóa người dùng thất bại.');
            }
        })
        .catch(error => console.error('Error:', error));
    }
}

// Hàm xử lý sự kiện chỉnh sửa thông tin người dùng
function suaNguoiDung(mand) {
    $.ajax({
        url: '/nguoidung/sua/' + mand,
        method: 'GET',
        success: function(data) {
            $('#mandSua').val(data.mand);
            $('#hotenSua').val(data.hoten);
            $('#sdtSua').val(data.sdt);
            $('#emailSua').val(data.email);
            $('#passwordSua').val(data.password);
            $('#sonhaSua').val(data.sonha);
            $('#duongSua').val(data.duong);
            $('#quanSua').val(data.quan);
            $('#thanhphoSua').val(data.thanhpho);
            $('#ngaytaotkSua').val(data.ngaytaotk);
            $('#solandatbanSua').val(data.solandatban);
            $('#mapqSua').val(data.mapq);
            toggleForm('suaNguoiDungForm');
            document.getElementById('suaNguoiDungForm').style.display = 'block';
            document.getElementsByClassName('danhsachnguoidung')[0].style.display = 'none';
        },
        error: function(error) {
            alert('Đã xảy ra lỗi khi lấy thông tin người dùng');
        }
    });
}

// Hàm xử lý sự kiện hủy chỉnh sửa
function huySua() {
    // Ẩn biểu mẫu chỉnh sửa
    document.getElementById('suaNguoiDungForm').style.display = 'none';
    document.getElementsByClassName('danhsachnguoidung')[0].style.display = 'block';
}

// Hàm để hiển thị chi tiết người dùng
function xemChiTiet(mand) {
    $.ajax({
        url: '/nguoidung/chitiet/' + mand,
        method: 'GET',
        success: function(data) {
            $('#hotenChiTiet').val(data.hoten);
            $('#sdtChiTiet').val(data.sdt);
            $('#emailChiTiet').val(data.email);
            $('#sonhaChiTiet').val(data.sonha);
            $('#duongChiTiet').val(data.duong);
            $('#quanChiTiet').val(data.quan);
            $('#thanhphoChiTiet').val(data.thanhpho);
            $('#ngaytaotkChiTiet').val(data.ngaytaotk);
            $('#solandatbanChiTiet').val(data.solandatban);
            $('#mapqChiTiet').val(data.mapq);
            
            // Hiển thị biểu mẫu chi tiết người dùng
            document.getElementById('chiTietNguoiDungForm').style.display = 'block';
            document.getElementsByClassName('danhsachnguoidung')[0].style.display = 'none';
        },
        error: function(error) {
            alert('Đã xảy ra lỗi khi lấy thông tin người dùng');
        }
    });
}
function quaylai() {
    // Ẩn biểu mẫu chỉnh sửa
    document.getElementById('chiTietNguoiDungForm').style.display = 'none';
    document.getElementsByClassName('danhsachnguoidung')[0].style.display = 'block';
}
function quaylaithem() {
    // Ẩn biểu mẫu chỉnh sửa
    document.getElementById('themKhachHangForm').style.display = 'none';
    document.getElementsByClassName('danhsachnguoidung')[0].style.display = 'block';
}
