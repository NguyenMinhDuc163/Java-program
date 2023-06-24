/*
 * Cho 3 lớp Person, Student, Staff theo thiết kế dưới đây

image

Cho danh sách nhân viên và sinh viên của 1 trường đại học, bạn hãy đọc vào danh sách và thực hiện

In ra danh sách nhân viên sau khi sắp xếp lương giảm dần, nếu có 2 người có cùng lương thì sắp xếp theo tên tăng dần về từ điển.

In ra danh sách sinh viên theo thứ tự học phí giảm dần, nếu có 2 sinh viên có cùng học phí thì sắp xếp theo tên tăng dần về từ điển.

Input Format

Dòng 1 là N và M : số lượng sinh viên và nhân viên

Các dòng tiếp theo mô tả sinh viên, mỗi sinh viên gồm 5 dòng : Tên, địa chỉ, ngành học, năm học, học phí

Các dòng tiêp theo mô tả nhân viên, mỗi nhân viên gồm 4 dòng : Tên, địa chỉ, tên trường, lương

Constraints

1<=N,M<=2000
Output Format

In ra danh sách nhân viên sau đó in ra danh sách sinh viên theo mẫu, phần học phí và lương in ra với độ chính xác 2 chữ số sau dấu phẩy
Sample Input 0

5 9
-----------------
Philip Smith
PennsylvaniaRhode Island
Health Professions
4
131000
-----------------
Rick Williams
Wisconsin
Visual and Performing Arts
3
100000
-----------------
Benjamin Erickson
New Mexico
Engineering
1
110000
-----------------
Claude Anderson
Delaware
Business
1
135000
-----------------
Samuel Matthews
IllinoisIndiana
Health Professions
1
109000
-----------------
Ramon Wheeler
Iowa
Harvard
122000
-----------------
Dan Flores
North Carolina
Harvard
187000
-----------------
Dan Flores
Maryland
Harvard
192000
-----------------
Samuel Matthews
Georgia
Harvard
104000
-----------------
Aidan Simmons
IllinoisIndiana
Stanford
198000
-----------------
Liam Smith
New York
Harvard
178000
-----------------
Charlie Burns
North Dakota
Harvard
194000
-----------------
Conner Martin
Massachusetts
Stanford
139000
-----------------
Clark Green
Connecticut
Harvard
156000
-----------------
Sample Output 0

Student List :
-----------------
Full Name : Claude Anderson
Address : Delaware
Program : Business
Year : 1
Fee : 135000 $
-----------------
Full Name : Philip Smith
Address : PennsylvaniaRhode Island
Program : Health Professions
Year : 4
Fee : 131000 $
-----------------
Full Name : Benjamin Erickson
Address : New Mexico
Program : Engineering
Year : 1
Fee : 110000 $
-----------------
Full Name : Samuel Matthews
Address : IllinoisIndiana
Program : Health Professions
Year : 1
Fee : 109000 $
-----------------
Full Name : Rick Williams
Address : Wisconsin
Program : Visual and Performing Arts
Year : 3
Fee : 100000 $
-----------------
Staff List :
-----------------
Full Name : Aidan Simmons
Address : IllinoisIndiana
School : Stanford
Pay : 198000 $
-----------------
Full Name : Charlie Burns
Address : North Dakota
School : Harvard
Pay : 194000 $
-----------------
Full Name : Dan Flores
Address : Maryland
School : Harvard
Pay : 192000 $
-----------------
Full Name : Dan Flores
Address : North Carolina
School : Harvard
Pay : 187000 $
-----------------
Full Name : Liam Smith
Address : New York
School : Harvard
Pay : 178000 $
-----------------
Full Name : Clark Green
Address : Connecticut
School : Harvard
Pay : 156000 $
-----------------
Full Name : Conner Martin
Address : Massachusetts
School : Stanford
Pay : 139000 $
-----------------
Full Name : Ramon Wheeler
Address : Iowa
School : Harvard
Pay : 122000 $
-----------------
Full Name : Samuel Matthews
Address : Georgia
School : Harvard
Pay : 104000 $
-----------------
 */