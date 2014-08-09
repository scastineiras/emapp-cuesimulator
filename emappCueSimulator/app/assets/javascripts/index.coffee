$ ->
  $.get "/patients", (data) ->
    $.each data, (index, patient) ->
      $("#patients").append $("<li>").text patient.finalName