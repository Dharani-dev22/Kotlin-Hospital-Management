class Patient(var id: Int, var name: String, var age: Int, var ailment: String) {
    var isAdmitted: Boolean = true
}

class Hospital {
    var patients = mutableListOf<Patient>()
    var nextId = 101

    fun addPatient(name: String, age: Int, ailment: String) {
        var newPatient = Patient(nextId, name, age, ailment)
        patients.add(newPatient)
        nextId = nextId + 1
        println("Patient added successfully.")
    }

    fun viewPatients() {
        if (patients.size == 0) {
            println("No patients available.")
        } else {
            for (patient in patients) {
                var status = "Admitted"
                if (patient.isAdmitted == false) {
                    status = "Discharged"
                }
                println("ID: ${patient.id} | Name: ${patient.name} | Age: ${patient.age} | Ailment: ${patient.ailment} | Status: $status")
            }
        }
    }

    fun dischargePatient(id: Int) {
        var found = false
        for (patient in patients) {
            if (patient.id == id) {
                found = true
                if (patient.isAdmitted == true) {
                    patient.isAdmitted = false
                    println("Patient has been discharged.")
                } else {
                    println("Patient is already discharged.")
                }
            }
        }
        if (found == false) {
            println("Patient not found.")
        }
    }

    fun searchPatientByName(name: String) {
        var found = false
        for (patient in patients) {
            if (patient.name == name) {
                found = true
                var status = "Admitted"
                if (patient.isAdmitted == false) {
                    status = "Discharged"
                }
                println("Found - ID: ${patient.id} | Name: ${patient.name} | Age: ${patient.age} | Ailment: ${patient.ailment} | Status: $status")
            }
        }
        if (found == false) {
            println("No patient found with that name.")
        }
    }
}

fun main() {
    var hospital = Hospital()
    var running = true

    while (running == true) {
        println("")
        println("--- Hospital Menu ---")
        println("1. Admit Patient")
        println("2. View Patients")
        println("3. Discharge Patient")
        println("4. Search Patient by Name")
        println("5. Exit")
        print("Enter choice: ")

        var choiceString = readlnOrNull()
        var choice = 0
        
        if (choiceString != null) {
            var parsedChoice = choiceString.toIntOrNull()
            if (parsedChoice != null) {
                choice = parsedChoice
            }
        }

        if (choice == 1) {
            print("Enter patient name: ")
            var name = readlnOrNull() ?: ""
            
            print("Enter age: ")
            var ageString = readlnOrNull()
            var age = 0
            
            if (ageString != null) {
                var parsedAge = ageString.toIntOrNull()
                if (parsedAge != null) {
                    age = parsedAge
                }
            }

            print("Enter ailment: ")
            var ailment = readlnOrNull() ?: ""
            hospital.addPatient(name, age, ailment)
            
        } else if (choice == 2) {
            hospital.viewPatients()
        } else if (choice == 3) {
            print("Enter patient ID to discharge: ")
            var idString = readlnOrNull()
            var id = 0
            
            if (idString != null) {
                var parsedId = idString.toIntOrNull()
                if (parsedId != null) {
                    id = parsedId
                }
            }
            hospital.dischargePatient(id)
        } else if (choice == 4) {
            print("Enter patient name to search: ")
            var name = readlnOrNull() ?: ""
            hospital.searchPatientByName(name)
        } else if (choice == 5) {
            running = false
            println("Exiting...")
        } else {
            println("Invalid choice.")
        }
    }
}