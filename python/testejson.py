
arquivo = open("dados3.json", "w")
numero_alunos = 3       # parâmetro que indica a quantidade de alunos
alunos = numero_alunos+1    # parâmetro utilizado

arquivo.write("{\n")
arquivo.write("    \"lista\": {\n")
arquivo.write("           \"aluno\": [\n")

for i in range(alunos):
    index = i
    ra = " {}".format(726000 + i)
    aluno = "               {\n"\
            "               \"nome\": \"Nome Aluno "+str(index)+"\",\n"\
            "               \"email\": \"email_aluno{0}@gmail.com\",\n"\
            "               \"ra\": {1}\n".format(i,ra)
    arquivo.write(aluno)
    if i != alunos-1:
        arquivo.write("               },\n")
    else:
        arquivo.write("              }\n")

arquivo.write("           ]\n")
arquivo.write("    }\n")
arquivo.write("}")
arquivo.close()