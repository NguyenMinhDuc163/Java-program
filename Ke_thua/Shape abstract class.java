/*
 * Xây dựng 4 lớp : Shape, Circle, Rectangle, Square theo thiết kế dưới đây

image

Nhập danh sách các đối tượng thuộc lớp Circle, Rectangle, Square sau đó tính toán chu vi và diện tích của từng hình và in ra kết quả trên màn hình. Lấy PI = 3.14

Input Format

Dòng 1 là N : Số lượng hình

Mỗi hình được mô tả bởi 1 dòng : Chữ cái đầu tiên là C, R, S tương ứng với mô tả hình Circle, Rectangle, Square.

Nếu là hình tròn thì mô tả tiếp theo sẽ là bán kính, màu sắc, trạng thái được tô màu.

Nếu là hình chữ nhật mô tả tiếp theo là độ dài 2 cạnh, màu sắc, trạng thái được tô màu.

Nếu là hình vuông thì mô tả tiếp theo là độ dài cạnh, màu sắc, trạng thái được tô màu.

Constraints

1<=N<=1000
Output Format

In ra danh sách hình tròn, hình chữ nhật, hình vuông theo thứ tự xuất hiện trong danh sách. Chu vi và bán kính được lấy 2 số sau dấu phẩy.
Sample Input 0

6
S 9.00 Blue false
S 7.00 Green false
S 1.00 Yellow false
C 6.00 Blue false
C 5.00 Yellow false
R 6.00 5.00 Yellow false
Sample Output 0

Circle :
-----------------------
Radius : 6.00
Color : Blue
Filled : false
Perimeter : 37.68
Area : 113.04
-----------------------
-----------------------
Radius : 5.00
Color : Yellow
Filled : false
Perimeter : 31.40
Area : 78.50
-----------------------
Rectangle :
-----------------------
Width : 5.00
Length : 6.00
Color : Yellow
Filled : false
Perimeter : 22.00
Area : 30.00
-----------------------
Square :
-----------------------
Side : 9.00
Color : Blue
Filled : false
Perimeter : 36.00
Area : 81.00
-----------------------
-----------------------
Side : 7.00
Color : Green
Filled : false
Perimeter : 28.00
Area : 49.00
-----------------------
-----------------------
Side : 1.00
Color : Yellow
Filled : false
Perimeter : 4.00
Area : 1.00
-----------------------
 */