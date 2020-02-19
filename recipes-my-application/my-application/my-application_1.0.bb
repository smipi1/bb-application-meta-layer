DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit externalsrc

EXTERNALSRC = "../../src"

do_compile() {
	${CC} my-application.c secrets.c ${LDFLAGS} -o my-application
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 my-application ${D}${bindir}
}
