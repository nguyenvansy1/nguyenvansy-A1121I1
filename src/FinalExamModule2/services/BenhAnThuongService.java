package FinalExamModule2.services;

import FinalExamModule2.util.NotFoundMedicalRecordException;

interface BenhAnThuongService {

void display();


void addNew();


void delete() throws NotFoundMedicalRecordException;
}


