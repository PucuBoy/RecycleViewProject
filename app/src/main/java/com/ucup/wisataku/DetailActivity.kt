package com.ucup.wisataku

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private val imageIds = arrayOf(
        R.drawable.curug_parigi,
        R.drawable.danau_cibereum,
        R.drawable.gedung_juang,
        R.drawable.gowet_waterpark,
        R.drawable.hutan_kota,
        R.drawable.pantai_muara_gembong,
        R.drawable.rumah_pohon_jatiasih,
        R.drawable.situ_gede,
        R.drawable.transera_waterpark,
        R.drawable.saung_wulan,
    )

    private val deskripsiTambahan = arrayOf(
        "Sering disebut-sebut sebagai Niagara Mini, Curug Parigi adalah destinasi wisata alam Bekasi yang cukup layak untuk dikunjungi. Namun, untuk mencapai air terjun yang cukup lebar ini, kalian perlu sedikit melakukan tracking di jalur alam dengan pemandangan asri namun cukup menantang. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Perjalanan ke Curug Parigi mungkin memerlukan trekking di jalur alam yang menantang.\n" +
                "2. Fasilitas: Area parkir terbatas, tidak banyak fasilitas umum.\n" +
                "3. Waktu Terbaik: Kunjungan terbaik pada musim kemarau untuk melihat air terjun dalam kondisi terbaik.\n" +
                "4. Peringatan: Jaga kebersihan saat berkunjung, karena tempat ini adalah area alam.\n" +
                "5. Keunikan: Legenda lokal dan suasana alam yang menawan menjadi daya tarik utama.",

        "Danau Cibeureum yang memiliki luas sekitar 2 hektar dengan pulau kecil yang berada di tengah. Di tepian danau, Kalian juga bisa menemukan warung-warung yang menjajakan kuliner lokal. Destinasi wisata kota Bekasi ini juga merupakan spot hunting foto favorit fotografer untuk mengarahkan lensa kamera dan menangkap foto terbaik. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Jalan setapak untuk mencapai danau, mungkin membutuhkan waktu dan tenaga.\n" +
                "2. Fasilitas: Area piknik tersedia, warung makan di sekitar.\n" +
                "3. Aktivitas: Foto-foto menarik di sekitar danau, bisa menjadi spot foto favorit.\n" +
                "4. Keamanan: Perhatikan anak-anak di sekitar danau, karena tidak ada pengamanan khusus.\n" +
                "5. Alam: Pemandangan alam yang menakjubkan dan keanekaragaman hayati yang menarik.",

        "Objek wisata kota Bekasi yang bersejarah Gedung Juang ’45. Gedung yang juga dikenal dengan nama Gedung Tinggi ini adalah salah satu monumen bersejarah saksi bisu perjuangan masyarakat Bekasi pada masa kolonialisasi Belanda. Dengan arsitektur yang khas, Kalian bisa jadikan tempat wisata Bekasi satu ini sebagai salah satu spot hunting foto yang menarik di Bekasi. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Dapat dijangkau dengan transportasi umum, dekat dengan pusat kota.\n" +
                "2. Fasilitas: Museum yang menarik, dapatkan panduan wisata untuk informasi lebih lanjut.\n" +
                "3. Jam Buka: Periksa jam buka museum sebelum kunjungan.\n" +
                "4. Tours: Mungkin ada tur berpemandu yang memberikan informasi mendalam tentang sejarah.\n" +
                "5. Penghormatan: Jaga ketenangan saat berkunjung, karena tempat ini adalah monumen perjuangan.",

        "Go!Wet merupakan salah satu waterpark terluas di Indonesia, dan menjadi salah satu tempat wisata di Bekasi yang digemari. Berbagai wahana yang ada di waterpark satu ini antara lain kolam ombak Go!Wave, kolam malas untuk bersantai Go!Lazy, dan banyak pilihan perosostan waterboom seperti Go!Fast, Go!Sprint, Go!Speed, dan lainnya. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Mudah dijangkau dengan kendaraan pribadi atau transportasi umum.\n" +
                "2. Fasilitas: Berbagai jenis kolam renang dan wahana air, area bersantai untuk keluarga.\n" +
                "3. Waktu Kunjungan: Khusus hari-hari akhir pekan atau liburan, mungkin lebih ramai.\n" +
                "4. Harga Tiket: Cek harga tiket terlebih dahulu sebelum kunjungan.\n" +
                "5. Keamanan: Perhatikan anak-anak selama bermain air.",

        "Mencari tujuan wisata Bekasi terjangkau namun tetap menarik untuk dikunjungi? Hutan Kota Patriot Bina Bangsa bisa jadi pilihan wisata keluargamu. Di tempat wisata kota Bekasi ini, kalian bisa berpiknik bersama keluarga, bermain sepeda, atau berolahraga jogging di bawah rindangnya pohon. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Akses mudah dari berbagai daerah di sekitarnya.\n" +
                "2. Fasilitas: Area piknik dan olahraga, sepeda dan jalan kaki direkomendasikan.\n" +
                "3. Kebersihan: Jaga kebersihan dengan tidak membuang sampah sembarangan.\n" +
                "4. Edukasi: Ada jalur pendidikan alam dan petunjuk mengenai tumbuhan di sekitar.\n" +
                "5. Kegiatan: Aktivitas keluarga seperti piknik atau bermain anak sangat dianjurkan.",

        "Pantai Muara Gembong bisa menjadi pilihan tepat untuk kamu yang ingin berlibur ke pantai melepas penat akhir pekan. Kamu bisa menikmati keindahan alam ditemani sajian kuliner seafood yang banyak dijajakan warung makan disekitar Pantai Muara Gembong bersama keluarga. Selain itu, kamu juga bisa menemukan spot foto yang menarik dengan latar pantai yang indah. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Jalan menuju pantai cukup mudah dijangkau dengan kendaraan pribadi.\n" +
                "2. Fasilitas: Warung makan seafood di sekitar pantai, fasilitas toilet dan tempat istirahat tersedia.\n" +
                "3. Aktivitas: Berbagai olahraga air seperti jet ski atau banana boat tersedia untuk disewa.\n" +
                "4. Keamanan: Perhatikan arus laut, karena beberapa area memiliki arus yang cukup kuat.\n" +
                "5. Sarana Foto: Spot foto yang indah dengan latar belakang pantai.",

        "Objek wisata keluarga sekaligus wisata alam di Bekasi ini menyajikan pemandangan alam yang asri. Di tempat wisata Bekasi satu ini, Toppers bisa berjalan santai dibawah rindangnya pepohonan, menikmati panorama danau sekaligus memancing. Berbagai rumah pohon juga tersedia di komplek wisata Bekasi ini untuk bersantai bersama keluarga. Aktivitas lain yang bisa kalian lakukan di tempat wisata Bekasi ini antara lain outbond hingga mengendarai motor ATV. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Jalan ke rumah pohon bisa membutuhkan waktu dan usaha tambahan, terutama jika berjalan kaki.\n" +
                "2. Fasilitas: Tersedia penginapan di rumah pohon, perhatikan reservasi sebelumnya.\n" +
                "3. Keunikan: Pengalaman menginap yang berbeda, dekat dengan alam dan suasana yang tenang.\n" +
                "4. Aktivitas: Memancing atau menjelajahi alam sekitar sangat direkomendasikan.\n" +
                "5. Ketentuan: Pastikan membawa perlengkapan pribadi yang cukup untuk menginap.",

        "Dengan luas mencapai 7 hektar, destinasi wisata Bekasi ini cocok untuk kamu yang tengah mencari ketenangan di tengah-tengah suasana alami. Di sini, kalian bisa memancing atau sekedar mengelilingi danau dengan perahu kecil yang disediakan oleh masyarakat lokal. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Akses menuju danau cukup mudah dengan kendaraan pribadi atau angkutan umum.\n" +
                "2. Fasilitas: Area piknik dan spot memancing, disarankan membawa peralatan sendiri.\n" +
                "3. Lingkungan: Berhati-hatilah dengan kebersihan dan kelestarian alam sekitar.\n" +
                "4. Rekreasi: Perahu sewaan tersedia untuk mengelilingi danau atau sekadar menikmati suasana.\n" +
                "5. Pemandangan: Pemandangan danau yang tenang cocok untuk bersantai.",

        "Transera Waterpark menghadirkan nuansa eksotis khas Afrika di area wisatanya. Jadi, pengalaman bermain air di sini tidak bisa kamu dapatkan di tempat lain. Transera Waterpark adalah satu-satunya tempat yang menawarkan 2 area berbeda untuk dikunjungi, yaitu zona basah dan zona kering. Bukan hanya untuk liburan, Transera Waterpark juga menawarkan paket bagi kamu yang mau membuat acara keluarga atau kantor di sini. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Lokasi mudah diakses dari berbagai wilayah, parkir tersedia.\n" +
                "2. Fasilitas: Area kolam renang, wahana air, dan aktivitas keluarga.\n" +
                "3. Hiburan: Ada atraksi khusus yang dapat dinikmati, seperti pertunjukan atau acara tertentu.\n" +
                "4. Keamanan: Petugas keamanan dan pengawasan tersedia untuk menjaga keselamatan pengunjung.\n" +
                "5. Harga Tiket: Cek harga tiket dan jam buka sebelum kunjungan.",

        "Bekasi juga memiliki tujuan wisata kuliner yang cukup menarik untuk dikunjungi setelah seharian lelah mengelilingi berbagai tempat wisata di Bekasi, lho. Saung Wulan merupakan restaurant sentra kuliner, khususnya makanan khas Sunda dengan suasana bak pedesaan yang nyaman. Disini juga terdapat kolam pemancingan ikan. kalian bisa membawa alat pancing dan memancing ikan-ikan di kolam ini dan membayar Rp 35.000,00 per kilonya untuk membawa pulang hasil pancinganmu. \n"+
        "Poin poin penting disini : \n"+
                "1. Aksesibilitas: Mudah dijangkau dengan kendaraan pribadi atau transportasi umum.\n" +
                "2. Fasilitas: Restoran dengan konsep pedesaan, kolam pemancingan tersedia.\n" +
                "3. Makanan Khas: Menawarkan hidangan khas Sunda, disarankan mencicipi hidangan ikan segar.\n" +
                "4. Pemandangan: Suasana pedesaan yang tenang cocok untuk bersantai.\n" +
                "5. Aktivitas: Memancing dan bersantai di area restoran menjadi daya tarik tersendiri.\n"

    )

    private lateinit var ivDetailImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val namaTempat = intent.getStringExtra("nama_tempat")
        val deskripsiTempat = intent.getStringExtra("deskripsi_tempat")

        val position = intent.getIntExtra("posisi_gambar", 0)

        // Mengatur TextViews dan ImageView
        val tvDetailName: TextView = findViewById(R.id.tv_detail_name)
        val tvDetailDescription: TextView = findViewById(R.id.tv_detail_description)
        val ivDetailImage: ImageView = findViewById(R.id.tv_image_detail)

        tvDetailName.text = namaTempat
        val deskripsiTambahanTempat = deskripsiTambahan[position]
        val deskripsiLengkap = "$deskripsiTempat\n\n$deskripsiTambahanTempat"
        tvDetailDescription.text = deskripsiLengkap
        ivDetailImage.setImageResource(imageIds[position])
    }

}
