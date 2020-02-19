DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

EXTERNALSRC = "${@os.path.abspath(os.path.join(os.path.dirname(d.getVar('FILE')), '..', '..', 'src'))}"
inherit externalsrc

S = "${EXTERNALSRC}"
inherit cmake
