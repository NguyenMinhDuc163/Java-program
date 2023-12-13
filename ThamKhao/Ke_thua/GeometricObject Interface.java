/*
 * Thiết kế lớp Circle và Rectangle implement interface geometricObject có chứa 2 phương thức tính diện tích và chu vi như sau :

image

Nhập vào 1 danh sách hình tròn và HCN và tính toán chu vi, diện tích của các hình đã cho. Diện tích hình tròn tính theo công thức PI * PI * r

Input Format

Dòng 1 là N : Số lượng hình
Mỗi hình được mô tả bởi 1 dòng : Chữ cái đầu tiên là C, R tương ứng với mô tả hình Circle, Rectangle.

Nếu là hình tròn thì mô tả tiếp theo sẽ là bán kính

Nếu là hình chữ nhật mô tả tiếp theo là độ dài 2 cạnh

Constraints

1<=N<=1000
Output Format

In ra danh sách hình tròn, hình chữ nhật theo thứ tự xuất hiện trong danh sách. Chu vi và bán kính được lấy 2 số sau dấu phẩy.
Sample Input 0

8
C 9.00
R 2.00 1.00
R 10.00 9.00
C 5.00
R 2.00 5.00
C 2.00
C 7.00
C 7.00
Sample Output 0

Circle :
-----------------------
Radius : 9.00
Perimeter : 56.52
Area : 254.34
-----------------------
-----------------------
Radius : 5.00
Perimeter : 31.40
Area : 78.50
-----------------------
-----------------------
Radius : 2.00
Perimeter : 12.56
Area : 12.56
-----------------------
-----------------------
Radius : 7.00
Perimeter : 43.96
Area : 153.86
-----------------------
-----------------------
Radius : 7.00
Perimeter : 43.96
Area : 153.86
-----------------------
Rectangle :
-----------------------
Width : 1.00
Length : 2.00
Perimeter : 6.00
Area : 2.00
-----------------------
-----------------------
Width : 9.00
Length : 10.00
Perimeter : 38.00
Area : 90.00
-----------------------
-----------------------
Width : 2.00
Length : 5.00
Perimeter : 14.00
Area : 10.00
-----------------------
 */