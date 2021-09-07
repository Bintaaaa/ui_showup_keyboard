package com.example.submission_android_pemula.model

import com.example.submission_android_pemula.R
import com.example.submission_android_pemula.data.Keyboard

object KeyboardData {
    private val keyboardTitle = arrayOf(
        "Origin Keychron K1 TKL",
        "Custom GMMK Frog 75%",
        "Custom VX5 60%",
        "Custom VX8 60%",
        "Custom Keychron K6 65%",
        "Custom Keyboard 40%",
        "Custom Pressplay 65%",
        "Custom Keychron K2 60%",
        "Origin Leopold FC660M TKL",
        "Custom Leopold FC660M",
    )

    private val keyboardImage = arrayOf(
        R.drawable.key1,
        R.drawable.key2,
        R.drawable.key3,
        R.drawable.key4,
        R.drawable.key5,
        R.drawable.key6,
        R.drawable.key7,
        R.drawable.key8,
        R.drawable.key9,
        R.drawable.key10,
    )

    private val keyboardPrice = arrayOf(
        "$100/Pcs",
        "$70/Pcs",
        "$90/Pcs",
        "$50/Pcs",
        "$780/Pcs",
        "$550/Pcs",
        "$260/Pcs",
        "$160/Pcs",
        "$100/Pcs",
        "$56/Pcs",
    )

    private val keyboardDetail = arrayOf(
        """Keychron K1. Keytron K1. Mechanical Keyboard. Type On An Ultra-slim Wireless Mechanical Keyboard.
           With self-contained switches for easier typing in that Magic Keyboard style.
           and the tactile feel of mechanical keyboard with a minimalist design. Increased Typing Productivity.
        """.trimIndent(),
        """
          Full keyboard adjustment: Modular mechanical keyboard design allows you to change switches and pads quickly and easily,
          adjust your keyboard wired for quick and easy typing or ultra pristine movements in any game
          
        """.trimIndent(),
        """
            RGB Programable Lightning, Gateron Switch Gold Plated USB Connector, Braided Cable, Brand Logo Only On Spacebar Keycap,
            50 Million Clicks Lifetime,  Free Keycaps Puller, warranty 2 year
        """.trimIndent(),
        """
            This time the Vortex series released the VX8 variant with a 75% layout.
            Very compact and easy to carry and light. Several types of switches are provided so that users can choose at will.
        """.trimIndent(),
        """
            K6 is an innovative 65% wireless mechanical keyboard crafted to maximize your workspace while retaining all necessary multimedia,
            and function keys.Inspired by our community, we designed the K6 as compact as possible while still allowing users to access all essential multimedia,
            function keys on Mac and Windows through combination keys. Not to mention the important keys to boost productivity such as the arrow keys, home,
            page up and page down buttons.
        """.trimIndent(),
        """
            Provides a super rare layout where 40% of users can only focus on 
            letters and symbols only numbers and other functions are not available on this keyboard.
        """.trimIndent(),
        """
            Pressplay promises you to feel comfortable in typing, and this keyboard has been designed in such a way that new users can quickly adjust,
            to the layout. Many choices of themes are given such as space nort, tokyo midnight and so on.
        """.trimIndent(),
        """
            Keychron K2 (German ISO-DE QWERTZ Layout) is a 75% layout tactile wireless mechanical keyboard giving you all the keys and,
            functions you need while keeping it compact. With the largest battery seen in a mechanical board, Mac layout, connect up to 3 devices,
            comes with wired cable option, and 15+ types of RGB lighting option.
        """.trimIndent(),
        """
            Leopold keyboards are known for their amazing build-quality and long-life keyboards, 
            the FC660M is another keyboard that carries high-end in its name. The FC660M is constructed with a solid metal plate inside,
            providing no-flex or creaks during use. The case has a rough nice feel which makes the keyboard look nice in any environment.
        """.trimIndent(),
        """
            Despite the box and description this keyboard actually has 6-key rollover not N-key rollover via USB type A.
            It simply states it has "support". I think this keyboard has support for N-key rollover via ps/2 but I think this is quite
            misleading as no one in this day and age has a ps/2 port as it was invented 34 years ago.
        """.trimIndent()
    )

    private val keyboardCompany = arrayOf(
        "PT Nam Tech Indo",
        "PT GMMK keyboard",
        "PT Vortex Indonesia",
        "PT Vortex Indonesia",
        "PT Nam Tech Indo",
        "PT Art Type",
        "PT Indonesian Mecha Key",
        "PT Nam Tech Indo",
        "PT Leopold Tech",
        "PT Leopold Tech",
    )


    val listData: ArrayList<Keyboard>
        get() {
            val listKey = arrayListOf<Keyboard>()
            for (position in keyboardTitle.indices){
                val keyboard = Keyboard()
                keyboard.title = keyboardTitle[position]
                keyboard.image = keyboardImage[position]
                keyboard.price = keyboardPrice[position]
                keyboard.detail = keyboardDetail[position]
                keyboard.company = keyboardCompany[position]
                listKey.add(keyboard)
            }
            return listKey
        }
}