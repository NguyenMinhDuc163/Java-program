Một đội bóng tại giải bóng đá ngày Chủ Nhật gồm những thông tin :

Mã đội bóng

Tên đội bóng

Số trận đã đấu

Điểm số

Hiệu số thắng thua

Bạn được cung cấp bảng xếp hạng hiện thời của của giải đấu và một loạt các trận đấu tại vòng hiện tại, nhiệm vụ của bạn là hãy tính toán điểm số, hiệu số và cập nhật lại BXH của giải đấu. Biết rằng có 20 đội bóng trong giải đấu này. Sắp xếp thứ hạng đội bóng thứ tự điểm, hiệu số thắng thua, mã đội bóng theo thứ tự tăng dần về từ điểm

Input Format

Mỗi thông tin của 1 đội bóng gồm 4 dòng

Dòng 1 : Vị trí, Dòng 2 : Mã đội bóng, Dòng 3 : tên đội bóng, dòng 4 lần lượt là số trận đã đấu, hiệu số bàn thắng thua và điểm số.

Thông tin mỗi đội bóng được phân cách nhau một dòng các dấu gạch dưới.

10 dòng tiếp theo có dạng : X Y - Z T mang ý nghĩa đội X đấu với đội T, tỷ số là Y - Z

Constraints

N/A

Output Format

In ra bảng xếp hạng sau khi cập nhật kết quả của vòng đấu này.
Sample Input 0

#1
ARS
Arsenal
29 43 72
------------------
#2
MC
Manchester City
28 45 64
------------------
#3
NEW
Newcastle
27 22 50
------------------
#4
TOT
Tottenham
29 12 50
------------------
#5
MU
Manchester United
27 4 50
------------------
#6
BRI
Brighton
27 17 46
------------------
#7
ASL
Aston Villa
29 -1 44
------------------
#8
LIV
Liverpool
28 15 43
------------------
#9
BREN
Brentford
28 9 43
------------------
#10
FUL
Fullham
28 0 39
------------------
#11
CHE
Chelsea
29 -1 39
------------------
#12
CRY
Crystal Palace
29 -15 30
------------------
#13
LEED
Leeds United
29 -11 29
------------------
#14
WOL
Wolves
29 -19 28
------------------
#15
WEST
West Ham
27 -9 27
------------------
#16
EVE
Everton
29 -18 27
------------------
#17
FOR
Forest
29 -28 27
------------------
#18
BOU
Bournemouth
29 -30 27
------------------
#19
LEI
Leicester
29 -11 25
------------------
#20
SOU
Southampton
29 -24 23
------------------
Arsenal 1 - 0 Chelsea
Manchester City 0 - 2 Crystal Palace
Newcastle 0 - 3 Leeds United
Tottenham 4 - 4 Wolves
Manchester United 3 - 3 West Ham
Brighton 4 - 4 Everton
Aston Villa 2 - 1 Forest
Liverpool 3 - 1 Bournemouth
Brentford 2 - 3 Leicester
Fullham 2 - 2 Southampton
Sample Output 0

#1 ARS Arsenal 30 44 75
------------------
#2 MC Manchester City 29 43 64
------------------
#3 TOT Tottenham 30 12 51
------------------
#4 MU Manchester United 28 4 51
------------------
#5 NEW Newcastle 28 19 50
------------------
#6 BRI Brighton 28 17 47
------------------
#7 ASL Aston Villa 30 0 47
------------------
#8 LIV Liverpool 29 17 46
------------------
#9 BREN Brentford 29 8 43
------------------
#10 FUL Fullham 29 0 40
------------------
#11 CHE Chelsea 30 -2 39
------------------
#12 CRY Crystal Palace 30 -13 33
------------------
#13 LEED Leeds United 30 -8 32
------------------
#14 WOL Wolves 30 -19 29
------------------
#15 WEST West Ham 28 -9 28
------------------
#16 LEI Leicester 30 -10 28
------------------
#17 EVE Everton 30 -18 28
------------------
#18 FOR Forest 30 -29 27
------------------
#19 BOU Bournemouth 30 -32 27
------------------
#20 SOU Southampton 30 -24 24
------------------