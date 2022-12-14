QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

CONFIG += c++17

# You can make your code fail to compile if it uses deprecated APIs.
# In order to do so, uncomment the following line.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0

SOURCES += \
    dbl_arr.cpp \
    form.cpp \
    int_arr.cpp \
    main.cpp \
    mainwindow.cpp \
    str_arr.cpp

HEADERS += \
    dbl_arr.h \
    form.h \
    int_arr.h \
    mainwindow.h \
    str_arr.h

FORMS += \
    form.ui \
    mainwindow.ui

RC_FILE = ../temp/ico.rc
RC_FILE = ico.rc


# Default rules for deployment.
qnx: target.path = /tmp/$${TARGET}/bin
else: unix:!android: target.path = /opt/$${TARGET}/bin
!isEmpty(target.path): INSTALLS += target
