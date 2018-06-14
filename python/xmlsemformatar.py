
arquivo = open("dados10000sf.xml", "w")
numero_alunos = 10000       # parâmetro que indica a quantidade de alunos
alunos = numero_alunos+1    # parâmetro utilizado

arquivo.write("<lista>")

for i in range(alunos):
    ra = 726000 + i
    aluno = "<aluno>"\
            "<nome>Nome Aluno {}</nome>"\
            "<email>email_aluno{}@gmail.com</email>"\
            "<ra>{}</ra>"\
            "</aluno>".format(i,i,ra)
    arquivo.write(aluno)

arquivo.write("</lista>")
arquivo.close()