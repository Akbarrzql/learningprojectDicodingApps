package com.example.learningprojectdicoding

object MateriData {
    private val materiName = arrayOf("Kotlin",
    "Java",
    "JavaScript",
    "PHP",
    "HTML",
    "Dart",
    "Golang",
    "C",
    "Swift",
    "Phyton")

    private val MateriDetail = arrayOf("Kotlin adalah bahasa pemrogramman modern namun sudah matang yang bertujuan untuk membuat pengembang lebih bahagia. Ringkas, aman, dapat dioperasikan dengan Java dan bahasa lain, dan menyediakan banyak cara untuk menggunakan kembali kode di antara berbagai platform untuk pemrograman yang produktif. Kotlin pertama kali rilis pada Juli 2011. Kotlin dikembangkan selama 1 tahun oleh Dmitry Jemerov, penulis buku “Kotlin in action” bersama dengan Svetlana Isakova. Nama kotlin sendiri berasal dari pulau Kotlin di dekat St. Petersburg. Kotlin menjadi bahasa pemrograman ke 3 yang didukung android selain Java dan C++. Sejak rilis pada September 2018 yaitu versi 1.3 kotlin memiliki 2 ekstensi file yaitu .kt dan .kts. Kotlin versi 1.0 dirilis pada 15 Februari 2016 Versi ini secara resmi ditetapkan sebagai versi rilis stabil pertama dan JetBrains telah menetapkan dukungan versi sebelumnya untuk jangka panjangan dengan versi ini.\n" +
            "\n" +
            "Pada Google I/O 2017, Google mengumumkan dukungan kelas pertama untuk Kotlin pada Android."+
            "Kotlin versi 1.2 dirilis pada 28 November 2017. Fitur berbagi kode antara JVM dan platform Javascript baru ditambahkan pada versi rilis ini." +
            "Kotlin versi 1.3 dirilis pada 29 Oktober 2018, membawa coroutines pada pemrograman asynchronous\n"+
            "\n"+
            "Filosofi dikembangkan nya bahasa pemrograman Kotlin oleh JetBrains karena masing masing bahasa pemrograman memiliki keunggulan feature yang tidak dimiliki di bahasa pemrograman lainnya. Pada saat itu belum ada sebuah bahasa pemrograman yang memiliki paket lengkap fitur fitur unggulan yang terdapat pada masing masing bahasa pemrograman yang ada.\n" +
            "\n"+
            "Kotlin di desain untuk menjadi bahasa modern yang lebih unggul dari Java serta memiliki fitur fitur yang ada pada bahasa pemrograman lain namun tidak ada di dalam bahasa pemrograman Java.\n" +
            "Misalnya :\n" +
            "\n"+
            "1. Penulisan semicolon pada setiap ujung code di Kotlin bukan merupakan sebuah kewajiban, melainkan sebuah pilihan. (sama seperti yang terdapat di bahasa .NET serta C# dimana tidak perlu menambahkan semicolon di ujung code).\n" +
                    "\n"+
            "2. Kotlin mendukung extension function dimana fitur ini juga terdapat pada C#.\n" +
                    "\n"+
            "3. Mirip dengan phyton, kotlin mendukung spread operator dengan menggunakan tanda bintang(*) sebelum variable array untuk membongkar isi array sebagai argument yang dipisahkan oleh koma ke dalam suatu function.\n" +
                    "\n"+
            "Dan masih banyak lagi fitur fitur pada kotlin yang dapat membantu para developer menulis code dalam waktu yang singkat dan ringkas. Kotlin juga mendukung object oriented programming dan functional programming yang membuat developer dapat menulis code dengan menggabungkan ke dua paradigma pemrograman tersebut.\n" +
                    "\n"+
            "Kotlin dapat di operasikan bersilangan dengan java. Artinya code yang sebelumnya di buat dalam bahasa java dapat dipanggil di dalam code kotlin, begitupun sebaliknya. Para developer juga dapat menuliskan code java di dalam code kotlin dimana nantinya code java tersebut akan di convert secara otomatis ke dalam code kotlin oleh plugin yang dimiliki oleh kotlin.\n" +
                    "\n"+
            "Kotlin adalah bahasa pemrograman yang aman dari NPE (NullPointerException) atau yang sering disebut “The billion dollar mistake”. Kotlin akan melakukan pengecekan NPE pada saat kompilasi berjalan. Kotlin juga memiliki null-safe operator dimana operator ini dapat membedakan data types mana yang memiliki kemungkinan nilainya nullable atau non-nullable. Developer diharuskan memberikan “special care” pada setiap operation yang dilakukan pada data types yang memiliki nilai nullable tersebut, sehingga hal ini membuat code yang di buat oleh developer aman dari NPE.",
    "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995.\n"+
            "\n"+
            "Bahasa pemrograman Java terlahir dari The Green Project, yang berjalan selama 18 bulan, dari awal tahun 1991 hingga musim panas 1992. Proyek tersebut belum menggunakan versi yang dinamakan Oak. Proyek ini dimotori oleh Patrick Naughton, Mike Sheridan, dan James Gosling, beserta sembilan pemrogram lainnya dari Sun Microsystems. Salah satu hasil proyek ini adalah maskot Duke yang dibuat oleh Joe Palrang.\n" +
            "\n"+
            "Nama Oak, diambil dari pohon oak yang tumbuh di depan jendela ruangan kerja \"Bapak Java\", James Gosling. Nama Oak ini tidak dipakai untuk versi release Java karena sebuah perangkat lunak lain sudah terdaftar dengan merek dagang tersebut, sehingga diambil nama penggantinya menjadi \"Java\". Nama ini diambil dari kopi murni yang digiling langsung dari biji (kopi tubruk) kesukaan Gosling. Konon kopi ini berasal dari Pulau Jawa. Jadi nama bahasa pemrograman Java tidak lain berasal dari kata Jawa (bahasa Inggris untuk Jawa adalah Java).",
    "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer, Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT. JavaScript pertama kali dikembangkan oleh Brendan Eich dari Netscape di bawah nama Mocha, yang nantinya namanya diganti menjadi LiveScript, dan akhirnya menjadi JavaScript.\n"+
            "\n"+
            "Navigator sebelumnya telah mendukung Java untuk lebih bisa dimanfaatkan para pemrogram yang non-Java. Maka dikembangkanlah bahasa pemrograman bernama LiveScript untuk mengakomodasi hal tersebut. Bahasa pemrograman inilah yang akhirnya berkembang dan diberi nama JavaScript, walaupun tidak ada hubungan bahasa antara Java dengan JavaScript. JavaScript bisa digunakan untuk banyak tujuan, misalnya untuk membuat efek rollover baik di gambar maupun teks, dan yang penting juga adalah untuk membuat AJAX. JavaScript adalah bahasa yang digunakan untuk AJAX. ",
    "PHP: Hypertext Preprocessor atau hanya PHP saja, adalah bahasa skrip dengan fungsi umum yang terutama digunakan untuk pengembangan web. Bahasa ini awalnya dibuat oleh seorang pemrogram Denmark-Kanada Rasmus Lerdorf pada tahun 1994. Implementasi referensi PHP sekarang diproduksi oleh The PHP Group. PHP awalnya merupakan singkatan dari Personal Home Page, tetapi sekarang merupakan singkatan dari inisialisasi rekursif PHP: Hypertext Preprocessor.\n" +
            "\n" +
            "Kode PHP biasanya diproses di peladen web oleh interpreter PHP yang diimplementasikan sebagai modul, daemon, atau sebagai Common Gateway Interface (CGI) yang bisa dijalankan. Di server web, hasil dari kode PHP yang ditafsirkan dan dieksekusi (dapat berupa semua jenis data, seperti HTML atau data gambar biner) akan membentuk keseluruhan atau sebagian dari respons HTTP. Berbagai sistem templat web, sistem manajemen konten web, dan kerangka kerja web ada yang dapat digunakan untuk mengatur atau memfasilitasi pembuatan respons itu. Selain itu, PHP dapat digunakan untuk banyak tugas pemrograman di luar konteks web, seperti aplikasi grafis mandiri dan kontrol drone robotik. Kode PHP juga dapat langsung dieksekusi dari baris perintah.",
    "Hypertext Markup Language adalah bahasa markah standar untuk dokumen yang dirancang untuk ditampilkan di peramban internet. Ini dapat dibantu oleh teknologi seperti Cascading Style Sheets dan bahasa scripting seperti JavaScript dan VBScript. Pada tahun 1980 seorang ahli fisika, Tim Berners-Lee, dan juga seorang kontraktor di CERN (Organisasi Eropa untuk Riset Nuklir) mengusulkan dan menyusun ENQUIRE, sebuah sistem untuk ilmuwan CERN dalam membagi dokumen. Sembilan tahun kemudian, Berners-Lee mengusulkan adanya sistem markah berbasis internet.cBerners-Lee menspesifikasikan HTML dan menulis jaringan beserta perangkat lunaknya di akhir 1990. Pada tahun yang sama, Berners-Lee dan Robert Cailliau, insinyur sistem data CERN berkolaborasi dalam sebuah permintaan untuk pendanaan, namun tidak diterima secara resmi oleh CERN. Di catatan pribadinya sejak 1990 dia mendaftar \"beberapa dari banyak daerah yang menggunakan hypertext\" dan pertama-tama menempatkan sebuah ensiklopedia.\n" +
            "\n" +
            "Penjelasan pertama yang dibagi untuk umum dari HTML adalah sebuah dokumen yang disebut \"Tanda HTML\", pertama kali disebutkan di Internet oleh Tim Berners-Lee pada akhir 1991. Tanda ini menggambarkan 18 elemen awal mula, versi sederhana dari HTML. Kecuali untuk tag hyperlink, yang sangat dipengaruhi oleh SGMLguid, in-house Standard Generalized Markup Language (SGML) berbasis format dokumen di CERN. Sebelas elemen ini masih ada di HTML 4.\n" +
            "\n" +
            "HTML adalah bahasa markah yang digunakan peramban untuk menafsirkan dan menulis teks, gambar dan bahan lainnya ke dalam halaman web secara visual maupun suara. Karakteristik dasar untuk setiap item dari markah HTML didefinisikan di dalam peramban, dan karakteristik ini dapat diubah atau ditingkatkan dengan menggunakan tambahan halaman web desainer CSS. Banyak elemen teks ditemukan di laporan teknis ISO pada tahun 1988 TR 9537 Teknik untuk menggunakan SGML, yang pada gilirannya meliputi fitur bahasa format teks awal seperti yang digunakan oleh komandan RUNOFF dikembangkan pada awal 1960-an untuk sistem operasi: perintah-perintah format ini berasal dari perintah yang digunakan oleh pengetik untuk memformat dokumen CTSS secara manual. Namun, konsep SGML dari markah umum didasarkan pada unsur-unsur daripada hanya efek cetak, dengan pemisahan struktur dan markah juga; HTML telah semakin bergerak ke arah ini dengan CSS.",
    "Dart adalah bahasa pemrograman yang dirancang untuk pengembangan klien, seperti untuk web dan aplikasi seluler. Ini dikembangkan oleh Google dan juga dapat digunakan untuk membangun aplikasi server dan desktop. Dart adalah bahasa berorientasi objek, berbasis kelas, dan dikumpulkan dari sampah dengan sintaks gaya C. Dart diresmikan pada konferensi GOTO di Aarhus , Denmark, 10-12 Oktober 2012. Proyek ini didirikan oleh Lars Bak dan Kasper Lund. Dart 1.0 dirilis pada 14 November 2013.\n" +
            "\n" +
            "Dart awalnya mendapat sambutan yang beragam dan inisiatif Dart telah dikritik oleh beberapa orang karena memecah-mecah web, karena rencana awal untuk memasukkan Dart VM di Chrome. Rencana tersebut dibatalkan pada tahun 2015 dengan rilis 1.9 Dart untuk fokus pada kompilasi Dart ke JavaScript." +
            "Pada Agustus 2018, Dart 2.0 dirilis, dengan perubahan bahasa termasuk sistem tipe suara. Dart 2.6 memperkenalkan ekstensi baru, dart2native. Fitur ini memperluas kompilasi asli ke platform desktop Linux, macOS, dan Windows. Pengembang sebelumnya dapat membuat alat baru hanya menggunakan perangkat Android atau iOS. Selain itu, dengan ekstensi ini menjadi mungkin untuk menyusun program Dart menjadi executable mandiri. Jadi, menurut perwakilan perusahaan, sekarang tidak wajib untuk menginstal Dart SDK, executable mandiri sekarang dapat mulai berjalan dalam beberapa detik. Ekstensi baru ini juga terintegrasi dengan toolkit Flutter , sehingga memungkinkan untuk menggunakan compiler pada layanan kecil (misalnya, mendukung backend).",
    "Go adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Go adalah bahasa pemrograman sumber terbuka yang mudah, sederhana, efisien. Selain itu, Go memiliki level yang sama dengan Java. Golang dirilis perdana pada bulan November 2009. Golang telah digunakan di lingkungan produksi oleh Google dan perusahaan lain.\n" +
            "\n" +
            "Dua implementasi utama yang ada:\n" +
            "\n" +
            "Google Go compiler, \"gc\", yang dikembangkan sebagai perangkat lunak sumber terbuka. Pihaknya menargetkan berbagai platform, termasuk Linux, OS X, Windows, berbagai BSD dan Unix versi, dan juga (sejak 2015) perangkat selular (termasuk ponsel pintar).\n" +
            "Kedua compiler, acpi, adalah GCC frontend.\n" +
            "\"Gc\" toolchain telah self-hosting sejak versi 1.5.\n" +
            "\n" +
            "Go awalnya sebuah percobaan oleh para insinyur Google Robert Griesemer, Rob Pike, dan Ken Thompson untuk merancang sebuah bahasa pemrograman baru yang akan menyelesaikan kritik umum dari bahasa lain selama masih mempertahankan karakteristik positif. Pengembang dipertimbangkan bahasa baru seperti:\n" +
            "\n" +
            "diketik statis, scalable untuk sistem yang besar (seperti Java dan C++)\n" +
            "produktif dan dapat dibaca, tanpa terlalu banyak kata kunci wajib dan pengulangan (\"light on the page\" seperti bahasa dinamis)\n" +
            "tidak memerlukan lingkungan pengembangan terintegrasi, tetapi mendukung mereka dengan baik\n" +
            "mendukung jaringan dan multiprocessing\n" +
            "Dalam wawancara terakhir, semua dari tiga perancang bahasa tidak suka terhadap kompleksitas C++ sehingga menjadi motivasi utama untuk mendesain sebuah bahasa baru.\n" +
            "\n" +
            "Google merilis Go 1.0 pada bulan Maret 2012.",
    "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi. Pada tahun 1978, Dennis Ritchie dan Brian Kernighan menerbitkan edisi pertama dari buku yang berjudul The C Programming Language. Buku ini hingga sekarang diakui sebagai kitab suci bahasa C dan merupakan referensi utama seorang pemrogram yang ingin mengetahui tentang bahasa C, terutama karena begitu lengkapnya cakupan buku ini tentang bahasa C dan mudahnya program yang dicontohkan dalam buku ini.\n" +
            "\n" +
            "Versi bahasa C yang ditampilkan dalam buku ini kemudian dikenal dalam kalangan pemrogram sebagai C K&R. Pada buku The C Programming Language edisi kedua kemudian melingkupi ANSI C yang diperkenalkan belakangan.",
    "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple. Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014. Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta. Sebuah buku berisi 500 halaman petunjuk, The Swift Programming Language, dirilis bersamaan dengan WWDC, dan tersedia secara gratis di iBooks.\n" +
            "\n" +
            "Pada tanggal 2 Juni 2014, aplikasi WWDC menjadi yang pertama dirilis ke publik yang ditulis dengan Swift.",
    "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan.\n"+
            "\n"+
            "Python diketik secara dinamis dan pengumpulan sampah. Ini mendukung beberapa paradigma pemrograman, termasuk pemrograman terstruktur (terutama, prosedural), berorientasi objek, dan fungsional. Python sering dideskripsikan sebagai bahasa \"termasuk baterai\" karena perpustakaan standarnya yang komprehensif.[29]\n" +
            "\n" +
            "Python dibuat pada akhir 1980-an sebagai penerus bahasa ABC. Python 2.0, dirilis pada tahun 2000, memperkenalkan fitur-fitur seperti pemahaman daftar dan sistem pengumpulan sampah dengan penghitungan referensi.\n"+
            "\n"+
            "Python adalah bahasa pemrograman multi-paradigma. Pemrograman berorientasi objek dan pemrograman terstruktur juga didukung penuh, dan banyak fiturnya mendukung pemrograman fungsional dan pemrograman berorientasi aspek (termasuk dengan metaprogramming dan metaobjects (metode ajaib)). Banyak paradigma lain yang didukung melalui ekstensi, termasuk desain berdasarkan kontrak dan pemrograman logika.\n"+
            "\n"+
            "Filosofi inti bahasa diringkas dalam dokumen The Zen of Python (PEP 20), yang mencakup kata-kata mutiara seperti:\n" +
            "\n" +
            "Cantik itu lebih baik dari pada jelek.\n" +
            "Eksplisit lebih baik daripada implisit.\n" +
            "Sederhana lebih baik daripada kompleks.\n" +
            "Kompleks lebih baik daripada rumit.\n" +
            "Keterbacaan itu penting.\n" +
            "Daripada memiliki semua fungsionalitas yang dibangun ke dalam intinya, Python dirancang untuk menjadi sangat dapat dikembangkan. Modularitas yang ringkas ini membuatnya sangat populer sebagai sarana untuk menambahkan antarmuka yang dapat diprogram ke aplikasi yang ada. Visi Van Rossum tentang bahasa inti kecil dengan perpustakaan standar yang besar dan penerjemah yang mudah diperluas berasal dari rasa frustrasinya dengan ABC, yang mendukung pendekatan yang berlawanan.")

    val IconMateri = intArrayOf(R.drawable.kotlin,
    R.drawable.java1,
    R.drawable.js1,
    R.drawable.php1,
    R.drawable.html1,
    R.drawable.dart,
    R.drawable.golang,
    R.drawable.c,
    R.drawable.swift,
    R.drawable.phyton,
    )


    val listdata: ArrayList<Materi>
    get() {
        val  list = arrayListOf<Materi>()
        for (position in materiName.indices){
            val  materi = Materi()
            materi.name = materiName[position]
            materi.detail = MateriDetail[position]
            materi.photo = IconMateri[position]
            list.add(materi)
        }
        return list
    }
}