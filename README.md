# Final Project
Proyek ini adalah Contoh Implementasi terkait penggunakan selenium digabung dengan cucumber, Rest Assured, Junit, dan Gherkin juga penambahan GIT Actions.

## Instalasi
Ikuti langkah-langkah berikut untuk menginstal proyek ini:

1. Clone repositori ini:
```bash
git clone https://github.com/muhfizh/Final_Project.git
```

2. Pindah ke direktori proyek:
```bash
cd Final_Project
```

## Penggunaan
Anda dapat menjalankan tugas khusus yang telah dibuat dengan perintah berikut:
1. untuk menjalankan testing api gunakan:
```bash
./gradlew ApiTesting
```
2. untuk menjalankan testing web gunakan:
```bash
./gradlew WebTesting
```
3. untuk melakukan build semua task yang ada:
```bash
./gradlew Build
```
Untuk mendapatkan report allure gunaka perintah berikut: 
```bash
allure serve build/allure-results
```
