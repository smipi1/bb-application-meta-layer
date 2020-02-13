DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://*"

S = "${WORKDIR}"

do_compile() {
	${CC} secrets.c ${LDFLAGS} -o secrets.o
	${CC} my-application.c ${LDFLAGS} -o my-application.o
	${CC} my-application.o secrets.o ${LDFLAGS} -o my-application
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 my-application ${D}${bindir}
}
