package com.example.demoapp

data class Products(val name: String, val data: String)

object Supplier{
    val productList = listOf<Products>(
        Products(name = "iPhone SE",data = "The second-generation iPhone SE (also known as the iPhone SE 2 or the iPhone SE 2020) is a smartphone designed and developed by Apple Inc. It is part of the 13th generation of the iPhone, alongside the iPhone 11 and 11 Pro/Pro Max models. Apple announced the second-generation iPhone SE on April 15, 2020, coinciding with the discontinuation of the iPhone 8 and 8 Plus. The iPhone SE succeeded the smaller and lighter first-generation iPhone SE. Pre-orders began on April 17, 2020, and the phone was subsequently released on April 24, 2020.[10] It was released with a starting price of US399, and positioned as a budget phone."),
        Products(name = "iPhone 6s",data = "The iPhone 6S and iPhone 6S Plus (stylized and marketed as iPhone 6s and iPhone 6s Plus) are smartphones that were designed, developed, and marketed by Apple Inc. It is the ninth generation of the iPhone. They were announced on September 9, 2015, at the Bill Graham Civic Auditorium in San Francisco by Apple CEO Tim Cook, with pre-orders beginning September 12 and official release on September 25, 2015. The iPhone 6S and 6S Plus were succeeded by the iPhone 7 and iPhone 7 Plus on September 7, 2016[19] and were discontinued with the announcement of the iPhone XS, iPhone XS Max, and iPhone XR on September 12, 2018."),
        Products(name = "Samsung galaxy fold",data = "A new dawn in display technology: the screen folding Infinity Flex.An impressive AMOLED screen dynamic 7.3 inches that defies expectations. Made with a revolutionary polymer material in layers for maximum flexibility, the screen smartphone Galaxy largest to date."),
        Products(name = "Samsung galaxy flip",data = "The Samsung Galaxy Z Flip is an Android-based foldable smartphone developed by Samsung Electronics[1] as part of the Samsung Galaxy Z series.[2] Its existence was first revealed in an advertisement during the 2020 Academy Awards.[3] Unveiled alongside the Galaxy S20 on February 11, 2020, it was released on February 14, 2020. Unlike the Galaxy Fold, the device folds horizontally and uses a hybrid glass coating branded as Infinity Flex Display.It is available in three colors for the LTE version (Mirror Purple, Mirror Black, and Mirror Gold) and two colors for the 5G version[7] (Mystic Bronze and Mystic Gray). The 5G version was also made available in a limited-edition Mystic White color."),
        Products(name = "iPhone 11",data = "The iPhone 11 is a smartphone designed, developed, and marketed by Apple Inc. It is the 13th generation, lower-priced iPhone, succeeding the iPhone XR. It was unveiled on September 10, 2019, alongside the higher-end iPhone 11 Pro flagship at the Steve Jobs Theater in Apple Park, Cupertino, by Apple CEO Tim Cook. Preorders began on September 13, 2019, and the phone was officially released on September 20, 2019, one day after the official public release of iOS 13."),
        Products(name = "iPhone 12",data = "The iPhone 12 and iPhone 12 Mini (stylized and marketed as iPhone 12 mini) are a range of smartphones designed, developed, and marketed by Apple Inc. They are the fourteenth-generation, lower-priced iPhones, succeeding the iPhone 11. They were unveiled at a virtually held Apple Special Event at Apple Park in Cupertino, California on October 13, 2020, alongside the higher-end iPhone 12 Pro and iPhone 12 Pro Max flagships. Pre-orders for the iPhone 12 started on October 16, 2020, and the phone became available in most countries on October 23, 2020. Pre-orders for the iPhone 12 Mini began on November 6, 2020, and the phone became available on November 13, 2020."),
        Products(name = "iPhone 13",data = "The iPhone 13 and iPhone 13 Mini (stylized as iPhone 13 mini) are smartphones designed, developed, marketed, and sold by Apple Inc. They are the fifteenth generation of iPhones (succeeding the iPhone 12 and iPhone 12 Mini). They were unveiled at an Apple Event in Apple Park in Cupertino, California on September 14, 2021, alongside the higher priced iPhone 13 Pro and iPhone 13 Pro Max flagships.[12] Pre-orders for the iPhone 13 and iPhone 13 Mini began on September 17, 2021. They became available on September 24, 2021."),
        Products(name = "Boat headset",data = "BoAt also distributes a line of wireless headphones in both on-ear and over-ear form factors. Its headphones are marketed under the company's BoAt, Rockerz, and Nirvana brands and undiscounted prices range betwen ₹2,990 (~39) and ₹7,990 (~105) depending on the model and its features."),
        Products(name = "Macbook air",data = "The MacBook Air is a line of notebook computers developed and manufactured by Apple Inc. It consists of a full-size keyboard, a machined aluminum case, and, in the more modern versions, a thin light structure. The Air was originally positioned above the previous MacBook line as a premium ultraportable.[2] Since then, the original MacBook's discontinuation in 2011, and lowered prices on subsequent iterations, have made the Air Apple's entry-level notebook.[3] In the current product line, the MacBook Air is situated below the performance range MacBook Pro."),
        Products(name = "Macbook pro",data = "The MacBook Pro is a line of Macintosh notebook computers introduced in January 2006 by Apple Inc. It is the higher-end model of the MacBook family, sitting above the consumer-focused MacBook Air, and is currently sold with 13-inch, 14-inch, and 16-inch screens. All current models of the MacBook Pro use variants of the Apple-designed M1 system on a chip."),
        Products(name = "iMac",data = "The iMac Pro is a discontinued all-in-one personal computer and workstation designed, manufactured, and sold by Apple Inc. It was released on December 14, 2017.[1] While it was sold, it was one of four desktop computers in the Macintosh lineup, sitting above the consumer range Mac Mini and iMac, and serving as an all-in-one alternative to the Mac Pro."),
        Products(name = "Dell inspiron",data = "The Inspiron is a line of consumer-oriented laptops and desktop computers manufactured and sold by Dell. It is a range of affordable laptop computers, desktop computers and all-in-one computers.[1] The Inspiron range mainly competes against computers such as Acer's Aspire, Asus' Transformer Book Flip, VivoBook and Zenbook, HP's Pavilion, Stream and ENVY, Lenovo's IdeaPad, Samsung's Sens and Toshiba's Satellite."),
        Products(name = "Microsoft surface",data = "The Surface Pro is a first generation 2-in-1 detachable of the Microsoft Surface series, designed and manufactured by Microsoft. The device ran a 64-bit version of Windows 8 Pro operating system with a free upgrade possibility to Windows 8.1 Pro, and eventually also Windows 10. Initially announced as Surface for Windows 8 Pro on June 18, 2012, at a Los Angeles event,[10] Microsoft later renamed the device to Surface Pro, and launched it on February 9, 2013."),
        Products(name = "ipad pro",data = "iPad Pro is a premium professional sub-lineup of the iPad tablet computers by Apple Inc.. It runs iPadOS, an optimized derivation from the predecessor iOS. The original iPad Pro was introduced in September 2015 which was originally based in iOS 9; the second generation, unveiled in June 2017, made uses of an upgraded A10X Fusion chip with an extended 10.5-inch screen display. The home button was eliminated following the third lineup (October 2018) for a full display at 11-inch, and it features an array sensor Face ID capable of performing unlocking at wide angles. The fourth-lineup, introduced in March 2020, included the A12Z chip with added compatibility to the Magic Keyboard. The current model fifth generation was announced in April 2021, incorporating a desktop-class SoC Apple silicon M1 chip, marking the first model to not use an A-series processor."),
        Products(name = "Google pixel 4",data = "The Pixel 4 and Pixel 4 XL are a pair of Android smartphones designed, developed, and marketed by Google as part of the Google Pixel product line. They collectively serve as the successors to the Pixel 3 and Pixel 3 XL.[6][7] They were officially announced on October 15, 2019 at the Made by Google event and released in the United States on October 24.[8] On September 30, 2020, they were succeeded by the Pixel 5."),
        Products(name = "Apple watch",data = "The Apple Watch was released in April 2015 and quickly became the best-selling wearable device: 4.2 million were sold in the second quarter of fiscal 2015, and more than 100 million people were estimated to use an Apple Watch as of December 2020. Apple has introduced new generations of the Apple Watch with improved internal components each September each labeled by Apple a 'Series', with certain exceptions"),

        )
}