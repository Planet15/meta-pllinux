SUMMARY = "A console-only image that fully supports the target device \
hardware."

#IMAGE_FEATURES += "splash allow-empty-password \
#		   dbg-pkgs debug-tweaks dev-pkgs \ 
#		   doc doc-pkgs empty-root-password \ 
#		   package-management post-install-logging \
#                   ssh-server-openssh tools-debug tools-profile \
#	           tools-sdk tools-testapps" 


#TODO GRAPHIC support 
#IMAGE_FEATURES += "splash allow-empty-password \
#		   dev-pkgs \ 
#		   empty-root-password \ 
#		   package-management post-install-logging \
#                  ssh-server-openssh \
#	           tools-sdk x11" 

#IMAGE_INSTALL_append = " strace gcc net-tools bash \ 
#                         expect perl libaio \ 
#                         libattr libcap gconf libxrandr gtk+ glib-2.0 \ 
#			 startup-notification dbus-glib vte gnome-doc-utils \
#	                 pango cups intltool libgnomeui \
#			 libgweather libart-lgpl fontconfig popt gnome-common freetype \
#			 libgsf libgtkstylus libgtop libidl libnotify libsecret libwnck libxklavier \
#			 libgdata libgnome \
#			 gnome-desktop cheese \
#			 pinpoint \
#			 gparted abiword dconf desktop-file-utils \
#                        epiphany evince faenza-icon-theme \
#                         gnome-terminal libgnomecups libgnomeprint xinput  \
#			 gnome-panel tcp-wrappers libcanberra libxklavier grep consolekit libpam gnome-doc-utils xrdb \
#			 gedit gnome-backgrounds gnome-control-center \
#                         gnome-disk-utility gnome-keyring gnome-menus gnome-power-manager \
#                         gnome-session gnome-settings-daemon gnome-system-monitor gnome-vfs gnumeric \
#                         gsettings-desktop-schemas gthumb gvfs \
#			 metacity nautilus orbit2 wv \   
#			 florence goffice \
#			 libnotify libsecret dbus-glib gconf gnome-keyring libgnome-keyring iso-codes \
#			 gsettings-desktop-schemas tasks contacts xterm \
#			 udev wireless-tools nss util-linux ppp \
#			 network-manager-applet \
#		      "

IMAGE_FEATURES += "dev-pkgs \ 
		   empty-root-password \ 
		   package-management \
		   post-install-logging \
                   ssh-server-openssh \
	           tools-sdk \
		   tools-profile \
	           " 

IMAGE_INSTALL_append = " strace gcc net-tools bash \ 
			grep shadow libpam consolekit vim \
			wireless-tools udev libaio \
			expect perl libaio mariadb \
			apache2 php samba xinetd procps \
			syslog-ng \
			netkit-telnet netkit-ftp \
			lvm2 multipath-tools openssl openvpn traceroute inetutils vlan atftp iscsi-initiator-utils drbd \
			proftpd squid tcpdump ntp lksctp-tools radiusclient-ng cifs-utils rp-pppoe bridge-utils ntp\
		       " 

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "665600" 
