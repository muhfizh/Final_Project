Feature: Web Otomasi

  @web
  Scenario: Daftar dengan username dan password yang baru
    Given pengguna berada pada tampilan utama
    And pengguna menekan label signup
    And pengguna memasukan username
    And pengguna memasukan password
    When pengguna menekan tombol sign up
    Then muncul pesan "Sign up successful."

  @web
  Scenario: Daftar dengan username dan password yang sudah ada
    Given pengguna berada pada tampilan utama
    And pengguna menekan label signup
    And pengguna memasukan username dengan "muhfizh_ufi"
    And pengguna memasukan password dengan "123"
    When pengguna menekan tombol sign up
    Then muncul pesan "This user already exist."

  @web
  Scenario: Masuk dengan username dan password yang benar
    Given pengguna berada pada tampilan utama
    And pengguna menekan label login
    And pengguna memasukan username dengan "muhfizh_ufi" dihalaman login
    And pengguna memasukan password dengan "123" dihalaman login
    When pengguna menekan tombol login
    Then pengguna masuk ke halaman utama

  @web
  Scenario: Masuk dengan username yang benar dan password yang salah
    Given pengguna berada pada tampilan utama
    And pengguna menekan label login
    And pengguna memasukan username dengan "muhfizh_ufi" dihalaman login
    And pengguna memasukan password dengan "321" dihalaman login
    When pengguna menekan tombol login
    Then pengguna gagal login dengan pesan "Wrong password."

  @web
  Scenario: Pengguna melakukan pembayaran produk pada kategory telepon
    Given pengguna berada pada tampilan utama
    Then pengguna memilih produk "Samsung galaxy s6"
    Then pengguna menekan tombol add to cart
    Then muncul pesan "Product added"
    When pengguna menekan tombol cart
    Then pengguna menekan tombol place order
    And pengguna mengisi nama "Muhfizh"
    And pengguna mengisi negara "Indonesia"
    And pengguna mengisi kota "Bandung"
    And pengguna mengisi kartu kredit "0121001470"
    And pengguna mengisi bulan "November"
    And pengguna mengisi tahun "1997"
    Then pengguna menekan tombol purchase
    Then pengguna mendapatkan pesan "Thank you for your purchase!"

  @web
  Scenario: Pengguna melakukan pembayaran produk pada kategory laptop
    Given pengguna berada pada tampilan utama
    Then pengguna memilih kategory laptop
    Then pengguna memilih produk "Sony vaio i5"
    Then pengguna menekan tombol add to cart
    Then muncul pesan "Product added"
    When pengguna menekan tombol cart
    Then pengguna menekan tombol place order
    And pengguna mengisi nama "Muhfizh"
    And pengguna mengisi negara "Indonesia"
    And pengguna mengisi kota "Bandung"
    And pengguna mengisi kartu kredit "0121001470"
    And pengguna mengisi bulan "November"
    And pengguna mengisi tahun "1997"
    Then pengguna menekan tombol purchase
    Then pengguna mendapatkan pesan "Thank you for your purchase!"

  @web
  Scenario: Pengguna melakukan pembayaran produk pada kategory monitor
    Given pengguna berada pada tampilan utama
    Then pengguna memilih kategory monitor
    Then pengguna memilih produk "Apple monitor 24"
    Then pengguna menekan tombol add to cart
    Then muncul pesan "Product added"
    When pengguna menekan tombol cart
    Then pengguna menekan tombol place order
    And pengguna mengisi nama "Muhfizh"
    And pengguna mengisi negara "Indonesia"
    And pengguna mengisi kota "Bandung"
    And pengguna mengisi kartu kredit "0121001470"
    And pengguna mengisi bulan "November"
    And pengguna mengisi tahun "1997"
    Then pengguna menekan tombol purchase
    Then pengguna mendapatkan pesan "Thank you for your purchase!"

  @web
  Scenario: Pengguna melakukan pembayaran tanpa mengisi nama
    Given pengguna berada pada tampilan utama
    Then pengguna memilih produk "Samsung galaxy s6"
    Then pengguna menekan tombol add to cart
    Then muncul pesan "Product added"
    When pengguna menekan tombol cart
    Then pengguna menekan tombol place order
    And pengguna mengisi negara "Indonesia"
    And pengguna mengisi kota "Bandung"
    And pengguna mengisi kartu kredit "0121001470"
    And pengguna mengisi bulan "November"
    And pengguna mengisi tahun "1997"
    Then pengguna menekan tombol purchase
    Then muncul pesan "Please fill out Name and Creditcard."

  @web
  Scenario: Pengguna melakukan pembayaran tanpa mengisi kartu kredit
    Given pengguna berada pada tampilan utama
    Then pengguna memilih produk "Samsung galaxy s6"
    Then pengguna menekan tombol add to cart
    Then muncul pesan "Product added"
    When pengguna menekan tombol cart
    Then pengguna menekan tombol place order
    And pengguna mengisi nama "Muhfizh"
    And pengguna mengisi negara "Indonesia"
    And pengguna mengisi kota "Bandung"
    And pengguna mengisi bulan "November"
    And pengguna mengisi tahun "1997"
    Then pengguna menekan tombol purchase
    Then muncul pesan "Please fill out Name and Creditcard."