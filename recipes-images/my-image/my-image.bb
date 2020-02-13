SUMMARY = "My custom image just capable of allowing a device to boot."
DESCRIPTION = "Base image for MEEE!"
LICENSE = "MIT"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    my-application \
    dropbear \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_LINGUAS = " "

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
