Feature: API test

  @api
  Scenario: Pengecekan mendapatkan list pengguna
    Given Mempersiapkan Url Get user
    And hit API dengan Get
    Then verifikasi kode status 200
    Then verifikasi respon body get data
    Then verifikasi respon json dengan JSON Schema "Get.Json"

  @api
  Scenario: Pengecekan pembuatan data baru
    Given Mempersiapkan Url post new user
    And hit API dengan POST
    Then verifikasi kode status 201
    Then verifikasi respon body post data
    Then verifikasi respon json dengan JSON Schema "Post.Json"

  @api
  Scenario: Pengecekan update data user
    Given Mempersiapkan Url put update user
    And hit API dengan POST
    Then verifikasi kode status 201
    Then verifikasi respon body post data
    And hit API dengan PUT
    Then verifikasi kode status 200
    Then verifikasi respon body put data

  @api
  Scenario: Pengecekan Delete user
    Given Mempersiapkan Url delete user
    And hit API dengan POST
    Then verifikasi kode status 201
    Then verifikasi respon body post data
    And hit API dengan DELETE
    Then verifikasi kode status 204

  @api
  Scenario: Pengecekan Get data authentifikasi gagal
    Given Mempersiapkan Url get authentifikasi gagal
    And hit API dengan get kondisi authentifikasi gagal
    Then verifikasi kode status 200

  @api
  Scenario: Pengecekan Post data authentifikasi gagal
    Given Mempersiapkan Url create data authentifikasi gagal
    And hit API dengan POST dengan authentifikasi gagal
    Then verifikasi kode status 401
