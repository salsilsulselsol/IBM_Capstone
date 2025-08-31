# IBM_Capstone_Project_Mini_Game

# Persiapan:

- Nyalakan mySQL di Xampp atau sejenisnya
- buka cmd di direktori projek ini
- pastikan ada mysql-connector di folder lib, contoh dibawah pakai mysql-connector-j-9.3.0.jar sesuaikan namanya jika berbeda

# Cara Run
Ada 2 cara:
1. Cara Manual
    - Compile dengan: javac -d bin -sourcepath src -cp "lib/mysql-connector-j-9.3.0.jar" src/Main.java
    - Salin Folder assets di src ke bin (opsional jika assets tidak ke load otomatis ke bin)
    - Run dengan: java -cp "bin;lib/mysql-connector-j-9.3.0.jar" Main

2. Cara Singkat
    Note :
    (Pastikan gunakan CMD)
    karena sudah ada script command .bat (khusus windows) tinggal ketik:
    compile
    lalu setelah selesai ketik:
    run

# Penggunaan IBM Granite

Pada pengembangan project ini, saya menggunakan IBM Granite untuk beberapa keperluan berikut:

- Generate kode secara otomatis untuk mempercepat proses development.
- Membantu proses debugging kode agar lebih efisien dan cepat menemukan error.
- Melengkapi dokumentasi dan komentar pada kode agar lebih mudah dipahami.
- Memberikan saran perbaikan dan optimasi pada struktur kode.
- Membantu integrasi dengan library eksternal seperti MySQL Connector.
- Memudahkan refactoring dan penataan ulang kode.

IBM Granite sangat membantu dalam meningkatkan produktivitas dan kualitas kode selama pengembangan project ini.