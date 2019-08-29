package com.tepuntal.linuxdistributions

object DistrosData {
    private val data = arrayOf(
        arrayOf(
            "Manjaro",
            "18.0.4 (Illyria)",
            "https://upload.wikimedia.org/wikipedia/commons/a/a5/Manjaro_logo_text.png",
            "Manjaro is an accessible, friendly, open-source Linux distribution and community. Based on Arch Linux, Manjaro provides all the benefits of cutting-edge software combined with a focus on getting started quickly, automated tools to require less manual intervention, and help readily available when needed. Manjaro is suitable for both newcomers and experienced Linux users."
        ),
        arrayOf(
            "Ubuntu",
            "19.04 (Disco Dingo)",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Logo-ubuntu_no%28r%29-black_orange-hex.svg/1024px-Logo-ubuntu_no%28r%29-black_orange-hex.svg.png",
            "Ubuntu is a free and open-source Linux distribution based on Debian. Ubuntu is officially released in three editions: Desktop, Server, and Core. All the editions can run on the computer alone, or e.g. in Windows. Ubuntu is a popular operating system for cloud computing, with support for OpenStack."
        ),
        arrayOf(
            "openSUSE",
            "15.1 (Leap)",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/OpenSUSE_Logo.svg/1024px-OpenSUSE_Logo.svg.png",
            "openSUSE, formerly SUSE Linux and SuSE Linux Professional, is a Linux distribution sponsored by SUSE Linux GmbH and other companies. It is widely used throughout the world."
        ),
        arrayOf(
            "Mint",
            "19.2 (Tina)",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Linux_Mint_Official_Logo.svg/1280px-Linux_Mint_Official_Logo.svg.png",
            "Linux Mint is a community-driven Linux distribution based on Ubuntu that strives to be a modern, elegant and comfortable operating system which is both powerful and easy to use."
        ),
        arrayOf(
            "Fedora",
            "30",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Fedora_logo_and_wordmark.svg/1024px-Fedora_logo_and_wordmark.svg.png",
            "Fedora or Fedora Linux is a Linux distribution developed by the community-supported Fedora Project and sponsored primarily by Red Hat. Fedora contains software distributed under various free and open-source licenses and aims to be on the leading edge of such technologies."
        ),
        arrayOf(
            "CentOS",
            "7.7-1908",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Centos-logo-light.svg/1024px-Centos-logo-light.svg.png",
            "CentOS is a Linux distribution that provides a free, enterprise-class, community-supported computing platform functionally compatible with its upstream source, Red Hat Enterprise Linux."
        ),
        arrayOf(
            "Deepin",
            "15.11",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Deepin_logo.svg/1024px-Deepin_logo.svg.png",
            "Deepin is an open source operating system based on Debian's stable branch. It features DDE, the Deepin Desktop Environment, built on Qt. As of version 15.10 it also uses dde-kwin, a copy of KDE Plasma's window manager."
        ),
        arrayOf(
            "Debian",
            "10 (Buster)",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Debian-OpenLogo.svg/775px-Debian-OpenLogo.svg.png",
            "Debian is a Unix-like operating system consisting entirely of free and open-source software. Ian Murdock founded the Debian Project on August 16, 1993. The first version, Debian 0.01, was released on September 15, 1993, and the first stable version, 1.1, was released on June 17, 1996."
        ),
        arrayOf(
            "Arch",
            "2019.08.01",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Arch_Linux_logo.svg/1024px-Arch_Linux_logo.svg.png",
            "Arch Linux is a Linux distribution for computers based on x86-64 architectures. Arch Linux is composed of free, open-source and nonfree software, and supports community involvement."
        ),
        arrayOf(
            "Peppermint",
            "10",
            "https://peppermintos.com/wp-content/uploads/2017/03/xpeppermint_logo_full_2000w.png.pagespeed.ic.e49SUYgmjE.png",
            "Peppermint Linux OS is a cloud-centric OS based on Lubuntu, a derivative of the Ubuntu Linux operating system that uses the LXDE desktop environment. It aims to provide a familiar environment for newcomers to Linux, which requires relatively low hardware resources to run."
        )
    )

    val listData: ArrayList<Distro>
        get() {
            var list = arrayListOf<Distro>()
            for (aData in data) {
                val distro = Distro()
                distro.name = aData[0]
                distro.version = aData[1]
                distro.logo = aData[2]
                distro.description = aData[3]

                list.add(distro)
            }

            return list
        }
}