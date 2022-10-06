#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    db = QSqlDatabase::addDatabase("QSQLITE");
    db.setDatabaseName("./lab.db");
    if(db.open())
    {
        qDebug("opne");
    }
    else
    {
        qDebug("no open");
    }
    query = new QSqlQuery(db);
    query -> exec("CREATE TABLE Logs(row_1 TEXT, row_2 TEXT);");

    model = new QSqlTableModel(this, db);
    model -> setTable("Logs");
    model -> select();

    ui -> tableView -> setModel(model);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    model -> insertRow(model -> rowCount());
}

void MainWindow::on_pushButton_2_clicked()
{
    model -> removeRow(row);
}

void MainWindow::on_tableView_clicked(const QModelIndex &index)
{
    row = index.row();
}

